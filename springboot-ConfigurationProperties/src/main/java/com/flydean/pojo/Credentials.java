package com.flydean.pojo;

import lombok.Data;

/**
 * @author wayne
 * @version Credentials,  2020/2/1 11:15 上午
 */
@Data
public class Credentials {
    private String authMethod;
    private String username;
    private String password;
}