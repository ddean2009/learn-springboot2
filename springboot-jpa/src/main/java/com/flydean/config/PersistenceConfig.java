package com.flydean.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author wayne
 * @version PersistenceConfig,  2020/2/15 10:15 上午
 */
@Configuration
@EnableJpaRepositories(basePackages = "com.flydean.repository")
public class PersistenceConfig {
}
