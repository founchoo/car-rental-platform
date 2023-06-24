package com.dart.carrentalplatform.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/24/2023 3:47 PM
 */
@Configuration
public class Swagger3Config {
    @Bean
    public Docket apiConfig() {
        return new Docket(DocumentationType.OAS_30)
            .apiInfo(apiInfo())
            .select()
            .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
            .paths(PathSelectors.any())
            .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("汽车租赁管理系统")
            .description("汽车出租|汽车保养|汽车入库等功能").contact(new Contact(
                    "摘叶飞镖", "https://www.cnblogs.com/founchoo", "founchoo@outlook.com"))
            .version("1.0")
            .build();
    }
}

