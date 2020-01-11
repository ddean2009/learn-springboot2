package com.flydean.learn.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author wayne
 * @version Book,  2020/1/10 11:17 下午
 */
@Entity
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false, unique = true)
    private String title;

    @Column(nullable = false)
    private String author;
}