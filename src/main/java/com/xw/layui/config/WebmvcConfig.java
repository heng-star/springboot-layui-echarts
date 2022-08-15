package com.xw.layui.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class WebmvcConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry){

        registry.addInterceptor(null).addPathPatterns("/admin/**").excludePathPatterns("/","/static/**","/favicon.ico");

    }
}
