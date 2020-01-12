package com.flydean.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author wayne
 * @version GenericEntity,  2020/1/12 6:49 上午
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class GenericEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String value;

    public GenericEntity(String value) {
        this.value=value;
    }
}
