package com.flydean.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * @author wayne
 * @version Category,  2020/2/23 10:29 下午
 */
@Data
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Book> books;
}
