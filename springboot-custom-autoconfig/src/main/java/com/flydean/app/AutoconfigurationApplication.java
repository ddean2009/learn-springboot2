package com.flydean.app;

import com.flydean.config.MySQLAutoconfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wayne
 * @version AutoconfigurationApplication,  2020/1/22 11:32 下午
 */
@SpringBootApplication
//@SpringBootApplication(exclude={MySQLAutoconfiguration.class})
public class AutoconfigurationApplication {
    public static void main(String[] args) {
        SpringApplication.run(AutoconfigurationApplication.class, args);
    }
}
