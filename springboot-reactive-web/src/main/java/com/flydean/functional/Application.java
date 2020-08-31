package com.flydean.functional;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wayne
 * @version Application,  2020/8/30
 */
@Slf4j
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        WelcomeWebClient welcomeWebClient = new WelcomeWebClient();
        log.info("react result is {}",welcomeWebClient.getResult());
    }
}
