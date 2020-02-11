package com.flydean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wayne
 * @version DevToolApp,  2020/2/11 9:56 上午
 */
@Slf4j
@SpringBootApplication
public class DevToolApp {
    public static void main(String[] args) {
        SpringApplication.run(DevToolApp.class, args);
        log.info("it is a Dev Tool app");
    }
}
