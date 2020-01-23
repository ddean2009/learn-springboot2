package com.flydean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author wayne
 * @version ConfigWebApp,  2020/1/23 11:48 上午
 */
@SpringBootApplication
public class ConfigWebApp {
    public static void main(String[] args) {
        SpringApplication.run(ConfigWebApp.class, args);
    }

//    @Autowired
//    public void shutDown(ApplicationContext applicationContext) {
//        SpringApplication.exit(applicationContext, () -> 0);
//    }
}
