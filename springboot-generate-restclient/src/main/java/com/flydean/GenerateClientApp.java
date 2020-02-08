package com.flydean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author wayne
 * @version GenerateClientApp,  2020/2/8 10:17 上午
 */
@SpringBootApplication
public class GenerateClientApp {

    public static void main(String[] args) {
        SpringApplication.run(GenerateClientApp.class, args);
    }


    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

}
