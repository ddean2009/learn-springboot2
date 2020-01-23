package com.flydean.app;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author wayne
 * @version MyUser,  2020/1/22 11:31 下午
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyUser {
    @Id
    private String email;

    // standard constructor, getters, setters
}

