package top.codingmore.tobebetterjavaer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import top.codingmore.tobebetterjavaer.interceptor.LoggerInterceptor;

/**
 * @program: tobebetterjavaer
 * @description: 333
 * @packagename: top.codingmore.tobebetterjavaer.config
 * @author: 姚泽宇
 * @date: 2022-06-16 10:43
 **/
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoggerInterceptor()).addPathPatterns("/**");
    }
}
