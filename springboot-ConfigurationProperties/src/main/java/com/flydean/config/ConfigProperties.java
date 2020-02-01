package com.flydean.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;


/**
 * @author wayne
 * @version ConfigProperties,  2020/2/1 11:04 上午
 */
@Data
@Validated
@Configuration
@ConfigurationProperties(prefix = "mail")
public class ConfigProperties {

    @NotBlank
    private String hostName;
    @Min(1025)
    @Max(65536)
    private int port;
    @Pattern(regexp = "^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$")
    private String from;
}
