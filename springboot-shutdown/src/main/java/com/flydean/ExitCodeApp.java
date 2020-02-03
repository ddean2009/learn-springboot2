package com.flydean;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wayne
 * @version ExitCodeApp,  2020/2/3 2:59 下午
 */
@SpringBootApplication
public class ExitCodeApp implements ExitCodeGenerator {
    public static void main(String[] args) {
        System.exit(SpringApplication.exit(SpringApplication.run(ExitCodeApp.class, args)));
    }

    @Override
    public int getExitCode() {
        return 11;
    }
}
