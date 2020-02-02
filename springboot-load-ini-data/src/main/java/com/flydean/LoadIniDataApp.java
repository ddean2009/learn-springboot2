package com.flydean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author wayne
 * @version LoadIniDataApp,  2020/2/2 9:26 下午
 */
@SpringBootApplication
//@EnableJpaRepositories("com.flydean.repository")
public class LoadIniDataApp {
    public static void main(String[] args) {
        SpringApplication.run(LoadIniDataApp.class,args);
    }
}
