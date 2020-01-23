package com.flydean.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wayne
 * @version SimpleController,  2020/1/23 3:58 下午
 */
@RestController
public class SimpleController {

    @GetMapping("/errorHaven")
    String errorHeaven() {
        return "You have reached the haven of errors!!!";
    }
}
