package com.dart.carrentalplatform.util;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/26/2023 9:46 AM
 */
public class ProjectGenerator {

    private static final String URL = "jdbc:mysql://110.41.176.195:3306/crp?useSSL=false";
    private static final String USERNAME = "crp";
    private static final String PASSWORD = "sC6jJstDhKKfysZ8";
    private static final String PACKAGE_NAME = "com.dart.carrentalplatformtest";
    private static final String AUTHOR_NAME = "Dart";
    private static final String OUTDIR_JAVA = ".\\src\\main\\java";
    private static final String OUTDIR_XML = ".\\src\\main\\resourcestest\\mapper";

    public static void main(String[] args) {
        FastAutoGenerator.create(URL, USERNAME, PASSWORD)
                .globalConfig(builder -> {
                    builder.author(AUTHOR_NAME) // 设置作者
                            .outputDir(OUTDIR_JAVA) // 指定输出目录
                            .disableOpenDir(); // 禁止打开输出目录
                })
                .packageConfig(builder -> {
                    builder.parent(PACKAGE_NAME) // 设置包名
                            .entity("entity") // 设置实体类包名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, OUTDIR_XML)); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("teacher") // 设置需要生成的表名
                            .controllerBuilder() //这里写controllerBuilder，表示将开始controller配置
                            .enableRestStyle();
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}