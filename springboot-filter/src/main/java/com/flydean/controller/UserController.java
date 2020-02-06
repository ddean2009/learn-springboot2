package com.flydean.controller;

/**
 * @author wayne
 * @version UserController,  2020/2/6 7:55 下午
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping()
    public List getAllUsers() {
        return new ArrayList();
    }
}
