package com.dart.carrentalplatform.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/27/2023 11:28 AM
 */
@Configuration
public class CORSConfig {
    @Bean
    public CorsFilter corsFilter(){
        CorsConfiguration config=new CorsConfiguration();
        //放行哪些原始域
        config.addAllowedOrigin("http://localhost:9527");
        //是否发送cookie信息
        config.setAllowCredentials(true);
        //放行哪些原始域请求方式
        config.addAllowedMethod("OPTIONS");
        config.addAllowedMethod("HEAD");
        config.addAllowedMethod("GET");
        config.addAllowedMethod("PUT");
        config.addAllowedMethod("POST");
        config.addAllowedMethod("DELETE");
        config.addAllowedMethod("PATCH");
        //放行哪些头信息
        config.addAllowedHeader("*");
        //添加映射路径,拦截所有请求
        UrlBasedCorsConfigurationSource configSource
                =new UrlBasedCorsConfigurationSource();
        configSource.registerCorsConfiguration("/**",config);
        //返回新的CoreFilter
        return new CorsFilter(configSource);
    }
}
