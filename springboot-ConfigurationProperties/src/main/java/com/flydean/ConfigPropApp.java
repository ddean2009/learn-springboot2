package com.flydean;

import com.flydean.config.ConfigProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author wayne
 * @version ConfigPropApp,  2020/2/1 11:05 上午
 */
@SpringBootApplication
//@EnableConfigurationProperties(ConfigProperties.class)
//@ConfigurationPropertiesScan("com.flydean.config")
public class ConfigPropApp {


    public static void main(String[] args) {
        SpringApplication.run(ConfigPropApp.class,args);

    }
}
