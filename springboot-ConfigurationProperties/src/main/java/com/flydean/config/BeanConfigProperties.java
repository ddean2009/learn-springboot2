package com.flydean.config;

import com.flydean.pojo.Item;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wayne
 * @version BeanConfigProperties,  2020/2/1 11:25 上午
 */
@Data
@Configuration
public class BeanConfigProperties {
    @Bean
    @ConfigurationProperties(prefix = "item")
    public Item item() {
        return new Item();
    }
}
