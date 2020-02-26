package com.flydean.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author wayne
 * @version Book,  2020/2/23 10:16 下午
 */
@Data
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

}