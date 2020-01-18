package com.flydean.config;

import com.flydean.controller.HealthCheckController;
import org.springframework.boot.autoconfigure.condition.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @author wayne
 * @version MySQLAutoconfiguration,  2020/1/18 12:03 上午
 */
@Configuration
@ConditionalOnClass(DataSource.class)
public class MySQLAutoconfiguration {

    @Bean
    @ConditionalOnBean(name = "dataSource")
    LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        // ...
        return null;
    }

    @Bean
    @ConditionalOnProperty(
            name = "usemysql",
            havingValue = "local"
    )
    DataSource dataSource() {
        // ...
        return null;
    }

    @Bean
    @ConditionalOnResource(resources = "classpath:mysql.properties")
    Properties additionalProperties() {
        // ...
        return null;
    }

    @Bean
    @ConditionalOnWebApplication
    HealthCheckController healthCheckController() {
        // ...
        return null;
    }

    @Bean
    @ConditionalOnExpression("${usemysql} && ${ mysqlserver=='local'} ")
    DataSource newDataSource() {
        // ...
        return null;
    }

    @Bean
    @Conditional(HibernateCondition.class)
    Properties newAdditionalProperties() {
        //...
        return null;
    }


}
