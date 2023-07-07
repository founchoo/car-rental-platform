package com.dart.carrentalplatform.controller;

import com.alibaba.excel.EasyExcel;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dart.carrentalplatform.service.BaseService;
import com.dart.carrentalplatform.util.ExcelListener;
import com.dart.carrentalplatform.util.Response;
import com.github.yulichang.base.MPJBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.util.Collection;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/29/2023 11:41 AM
 */
public class BaseController<S extends MPJBaseService<E>, E> {

    @Autowired
    protected S service;

    @ResponseBody
    @GetMapping("/getById")
    public Response getById(@RequestParam String id) {
        E data = service.getById(id);
        if (data == null) {
            return Response.fail().setMessage("不存在 ID 为 " + id + " 的数据");
        } else {
            return Response.success().setData("data", data);
        }
    }

    @ResponseBody
    @GetMapping("/getAll")
    public Response getAll() {
        return Response.success().setData("list", service.list());
    }

    @ResponseBody
    @GetMapping("/getAllByPage")
    public Response getAllByPage(@RequestParam int start, @RequestParam int size) {
        return Response.success().setData("page", service.page(new Page<>(start, size)));
    }

    @ResponseBody
    @GetMapping("/getAllSortedByPage")
    public Response getAllSortedByPage(@RequestParam int start, @RequestParam int size, @RequestParam String sort,
            @RequestParam boolean asc) {
        return Response.success().setData("page", service.page(new Page<>(start, size), new QueryWrapper<E>()
                .orderBy(true, asc, sort)));
    }

    @ResponseBody
    @GetMapping("/fuzzySearchByPage") //模糊分页检索

    // public Response fuzzySearchByPage(@RequestParam int start, @RequestParam int size, @RequestParam String key) 是方法的签名。
    //它使用了 @RequestParam 注解来绑定 HTTP 请求中的查询参数到方法的参数上。
    public Response fuzzySearchByPage(@RequestParam int start, @RequestParam int size, @RequestParam String key) {
        QueryWrapper<E> queryWrapper = new QueryWrapper<>();

        // Class<? extends Object> eClass = service.getEntityClass(); 通过
        // service.getEntityClass() 获取实体类的类型。
        Class<? extends Object> eClass = service.getEntityClass();

        // Field[] fields = eClass.getDeclaredFields(); 使用反射获取实体类中的所有字段。
        Field[] fields = eClass.getDeclaredFields();

        // for (Field field : fields) { ... } 循环遍历实体类的字段。
        for (Field field : fields) {

            // if (field.getType() == String.class) { ... } 检查字段的类型是否为 String。
            if (field.getType() == String.class) {

                // queryWrapper.or().like(field.getName(), key); 如果字段类型为 String，
                // 则使用 like 方法将模糊查询条件添加到 queryWrapper 中。
                queryWrapper.or().like(field.getName(), key);
            }
        }

        // queryWrapper.or().eq("id", key); 在循环之后，将等值查询条件添加到 queryWrapper 中，用于查询 "id"
        // 字段等于给定关键字的记录。
        queryWrapper.or().eq("id", key);

        // return Response.success().setData("page", service.page(new
        // Page<>(start,size), queryWrapper));
        // 返回一个成功的响应对象，其中使用 service.page 方法执行分页查询，并将查询结果设置为响应数据的 "page" 字段。
        return Response.success().setData(
                "page",
                service.page(new Page<>(start, size), queryWrapper));
    }

    @ResponseBody
    @GetMapping("/fuzzySearchByColumnByPage")
    public Response fuzzySearchByColumnByPage(@RequestParam int start, @RequestParam int size, @RequestParam String key,
            @RequestParam String column) {
        QueryWrapper<E> queryWrapper = new QueryWrapper<>();
        queryWrapper.or().like(column, key);
        return Response.success().setData(
                "page",
                service.page(new Page<>(start, size), queryWrapper));
    }

    /*
     * 区间筛选
     *
     * @param field 筛选字段
     */
    @ResponseBody
    @GetMapping("/filterRangeByPage")
    public Response filterRangeByPage(@RequestParam int start, @RequestParam int size, @RequestParam Object min,
            @RequestParam Object max, @RequestParam String column) {

        return Response.success().setData("page", service.page(new Page<>(start, size), new QueryWrapper<E>()
                .between(column, min, max)));
    }

    @ResponseBody
    @PostMapping("/add")
    public Response add(@RequestBody E data) {
        return service.save(data) ? Response.success() : Response.fail();
    }

    @ResponseBody
    @PutMapping("/update")
    public Response update(@RequestBody E data) {
        return service.updateById(data) ? Response.success() : Response.fail();
    }

    @ResponseBody
    @DeleteMapping("/delete")
    public Response delete(@RequestParam String id) {
        return service.removeById(id) ? Response.success() : Response.fail();
    }

    @ResponseBody
    @DeleteMapping("/deleteBatch")
    public Response deleteBatch(@RequestBody Collection<String> ids) {
        return service.removeBatchByIds(ids) ? Response.success() : Response.fail();
    }

    @GetMapping("/exportToExcel")
    public void exportToExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        response.setCharacterEncoding("utf-8");
        String fileName = URLEncoder.encode("excel", "UTF-8").replaceAll("\\+", "%20");
        response.setHeader("Content-disposition", "attachment;filename*=utf-8''" + fileName + ".xlsx");
        EasyExcel.write(response.getOutputStream(), service.getEntityClass()).sheet("模板").doWrite(service.list());
    }

    @PostMapping("/importFromExcel")
    public void importFromExcel(@RequestParam MultipartFile file) throws IOException {
        EasyExcel.read(file.getInputStream(), service.getEntityClass(), new ExcelListener<S, E>())
                .sheet().doRead();
    }
}
