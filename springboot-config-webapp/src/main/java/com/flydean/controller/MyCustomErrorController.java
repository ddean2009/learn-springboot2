package com.flydean.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wayne
 * @version MyCustomErrorController,  2020/1/23 11:52 下午
 */
@RestController
public class MyCustomErrorController implements ErrorController {

    private static final String PATH = "/error";

    @GetMapping(value=PATH)
    public String error() {
        return "Error haven";
    }

    public String getErrorPath() {
        return PATH;
    }
}
