package com.flydean.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

/**
 * @author wayne
 * @version Person,  2020/2/20 11:25 上午
 */
@Entity
@Data
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
                name = "count_by_name",
                procedureName = "person.count_by_name",
                parameters = {
                        @StoredProcedureParameter(
                                mode = ParameterMode.IN,
                                name = "name",
                                type = String.class),
                        @StoredProcedureParameter(
                                mode = ParameterMode.OUT,
                                name = "count",
                                type = Long.class)
                }
        )
})
public class Person {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    // ...

    private String name;

    private int age;

//    @CreatedBy
//    User creator;
//
//    @LastModifiedBy
//    User modifier;

    @CreatedDate
    Date createdAt;

    @LastModifiedDate
    Date modifiedAt;

    // ...

}
