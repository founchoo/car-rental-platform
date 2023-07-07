package com.dart.carrentalplatform.util;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.dart.carrentalplatform.service.BaseService;

import java.util.ArrayList;
import java.util.List;

import com.github.yulichang.base.MPJBaseService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/28/2023 7:45 PM
 */
public class ExcelListener<S extends MPJBaseService<E>, E> extends AnalysisEventListener<E> {

    @Autowired
    private S service;

    private List<E> list;

    public ExcelListener() {
        list = new ArrayList<>();
    }

    @Override
    public void invoke(E data, AnalysisContext context) {
        System.out.println(data);
        list.add(data);
        if (list.size() % 3 == 0){
            service.saveBatch(list);
            list.clear();
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        service.saveBatch(list);
    }
}
