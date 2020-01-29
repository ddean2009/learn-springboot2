package com.flydean.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * @author wayne
 * @version PropertiesWithJavaConfig,  2020/1/29 9:16 下午
 */
@Configuration
@PropertySource("classpath:foo.properties")
@PropertySource("classpath:bar.properties")
//@PropertySource({
//        "classpath:persistence-${envTarget:mysql}.properties"
//})
//@PropertySources({
//        @PropertySource("classpath:foo.properties"),
//        @PropertySource("classpath:bar.properties")
//})
@Data
public class PropertiesWithJavaConfig {

    @Value( "${jdbc.url}" )
    private String jdbcUrl;

    @Value( "${jdbc.url:aDefaultUrl}" )
    private String defaultUrl;
}
