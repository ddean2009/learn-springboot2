package com.flydean.controller;

import com.flydean.beans.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wayne
 * @version UserController,  2020/2/11 10:00 上午
 */
@RestController
public class UserController {

    @GetMapping("/getUser")
    public User getUser(){
        return new User();
    }
}
