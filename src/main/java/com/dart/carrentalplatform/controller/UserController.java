package com.dart.carrentalplatform.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dart.carrentalplatform.entity.User;
import com.dart.carrentalplatform.service.UserService;
import com.dart.carrentalplatform.util.EncryptUtil;
import com.dart.carrentalplatform.util.JwtUtil;
import com.dart.carrentalplatform.util.Response;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/26/2023 1:53 PM
 */
@Controller
@RequestMapping("/user")
@Api
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    @ResponseBody
    public Response login(@RequestBody User user) {
        QueryWrapper<User> wrapper = new QueryWrapper<User>()
                .eq("username", user.getUsername())
                .eq("password", EncryptUtil.encrypt(user.getPassword()));
        User one = userService.getOne(wrapper);
        if (one == null) {
            return Response.fail();
        } else {
            return Response.success().setData("token", JwtUtil.createToken(one));
        }
    }

    @GetMapping("/info")
    @ResponseBody
    public Response getInfo(@RequestParam String token) {
        Map<String, Object> map = JwtUtil.verifyToken(token);
        String username = (String)map.get("username");
        if (username != null) {
            return Response.success()
                    .setData("roles", List.of("admin", "super manager"))
                    .setData("name", username)
                    .setData("avatar", "https://s3.bmp.ovh/imgs/2023/06/26/22777ab7bec47493.jpg")
                    .setData("introduction", "个人介绍");
        } else {
            return Response.fail();
        }
    }

    @PostMapping("/logout")
    @ResponseBody
    public Response logout(@RequestHeader("X-Token") String token) {
        Map<String, Object> map = JwtUtil.verifyToken(token);
        //移除session中的登录标记或删除redis中的记录
        return Response.success();
    }
}
