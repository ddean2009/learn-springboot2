package com.flydean.component;

import com.flydean.servlet.SpringHelloWorldServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author wayne
 * @version ServletRegistrationBean,  2020/1/24 12:27 上午
 */
@Component
public class CustomServletRegistrationBean {

    @Bean
    public ServletRegistrationBean servletRegistrationBean() {

        ServletRegistrationBean bean = new ServletRegistrationBean(
                new SpringHelloWorldServlet(), "/springHelloWorld/*");
        bean.setLoadOnStartup(1);
        bean.addInitParameter("message", "SpringHelloWorldServlet special message");
        return bean;
    }
}
