package com.flydean.component;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

/**
 * @author wayne
 * @version CustomizationBean,  2020/1/23 11:52 上午
 */
@Component
public class CustomizationBean implements
        WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {

    @Override
    public void customize(ConfigurableServletWebServerFactory container) {
        container.setPort(8083);
        container.setContextPath("/springbootapp");
        container.addErrorPages(new ErrorPage(HttpStatus.BAD_REQUEST, "/400"));
        container.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/errorHaven"));
        container.addErrorPages(new ErrorPage("/errorHaven"));
    }

}
