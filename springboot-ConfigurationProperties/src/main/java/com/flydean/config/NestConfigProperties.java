package com.flydean.config;

import com.flydean.pojo.Credentials;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;

/**
 * @author wayne
 * @version NestConfigProperties,  2020/2/1 11:16 上午
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "nestmail")
public class NestConfigProperties {
    private String host;
    private int port;
    private String from;
    private List<String> defaultRecipients;
    private Map<String, String> additionalHeaders;
    private Credentials credentials;
}
