package com.flydean;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author wayne
 * @version ConfigurableApp,  2020/2/3 11:11 下午
 */
@SpringBootApplication
public class ConfigurableApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new
                SpringApplicationBuilder(ConfigurableApp.class).web(WebApplicationType.NONE).run();
        System.out.println("Spring Boot application started");
        ctx.getBean(TerminateBean.class);
        ctx.close();
    }
}
