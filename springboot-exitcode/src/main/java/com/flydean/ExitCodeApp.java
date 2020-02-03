package com.flydean;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;

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

    @Bean
    CommandLineRunner createException() {
        return args -> Integer.parseInt("test") ;
    }

    @Bean
    ExitCodeExceptionMapper exitCodeToExceptionMapper() {
        return exception -> {
            // set exit code base on the exception type
            if (exception.getCause() instanceof NumberFormatException) {
                return 80;
            }
            return 1;
        };
    }

    @Bean
    DemoListener demoListenerBean() {
        return new DemoListener();
    }

    private static class DemoListener {
        @EventListener
        public void exitEvent(ExitCodeEvent event) {
            System.out.println("Exit code: " + event.getExitCode());
        }
    }
}
