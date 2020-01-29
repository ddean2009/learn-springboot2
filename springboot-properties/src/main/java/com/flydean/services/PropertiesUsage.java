package com.flydean.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

/**
 * @author wayne
 * @version PropertiesUsage,  2020/1/29 9:32 下午
 */
@Service
public class PropertiesUsage {

    @Autowired
    private Environment env;

    public String getJdbcUrl(){
        return env.getProperty("jdbc.url");
    }




}
