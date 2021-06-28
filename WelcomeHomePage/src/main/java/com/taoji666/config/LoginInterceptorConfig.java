package com.taoji666.config;

import com.taoji666.Handler.LoginHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
//public class LoginInterceptorConfig implements WebMvcConfigurer {
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new LoginHandler()).addPathPatterns("/**").excludePathPatterns("/css/**");
//        WebMvcConfigurer.super.addInterceptors(registry);
//    }
//}

