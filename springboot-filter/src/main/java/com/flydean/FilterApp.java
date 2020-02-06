package com.flydean;

import com.flydean.filter.RequestResponseLoggingFilter;
import com.flydean.filter.UrlFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * @author wayne
 * @version FilterApp,  2020/2/6 7:46 下午
 */
@SpringBootApplication
public class FilterApp {
    public static void main(String[] args) {
        SpringApplication.run(FilterApp.class,args);
    }

    @Bean
    public FilterRegistrationBean<UrlFilter> loggingFilter(){
        FilterRegistrationBean<UrlFilter> registrationBean
                = new FilterRegistrationBean<>();

        registrationBean.setFilter(new UrlFilter());
        registrationBean.addUrlPatterns("/users/*");

        return registrationBean;
    }
}
