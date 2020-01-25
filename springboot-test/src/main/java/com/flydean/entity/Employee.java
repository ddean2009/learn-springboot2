package com.flydean.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * @author wayne
 * @version Employee,  2020/1/25 1:02 下午
 */
@Data
@Entity
@NoArgsConstructor
@Table(name = "person")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Size(min = 3, max = 20)
    private String name;

    public Employee(String name) {
        this.name=name;
    }

    // standard getters and setters, constructors
}
