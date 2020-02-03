package com.flydean;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.ApplicationPidFileWriter;

/**
 * @author wayne
 * @version KillApp,  2020/2/3 11:27 下午
 */
@SpringBootApplication
public class KillApp {
    public static void main(String[] args) {
        SpringApplicationBuilder app = new SpringApplicationBuilder(KillApp.class)
                .web(WebApplicationType.NONE);
        app.build().addListeners(new ApplicationPidFileWriter("./bin/shutdown.pid"));
        app.run();
    }
}
