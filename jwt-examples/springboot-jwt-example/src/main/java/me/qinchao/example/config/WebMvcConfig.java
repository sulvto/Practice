package me.qinchao.example.config;

import me.qinchao.example.interceptor.AuthInterceptor;
import me.qinchao.example.interceptor.CommonInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by sulvto on 1/16/19.
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Bean
    public CommonInterceptor getCommonInterceptor() {
        return new CommonInterceptor();
    }

    @Bean
    public AuthInterceptor getAuthInterceptor() {
        return new AuthInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getAuthInterceptor()).excludePathPatterns("/api/admin/login").addPathPatterns("/api/**");

        // 拦截所有
        registry.addInterceptor(getCommonInterceptor()).addPathPatterns("/**");
    }
}
