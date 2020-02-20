package com.flydean.repository;

import com.flydean.entity.Person;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.LockModeType;

/**
 * @author wayne
 * @version ChildRepository,  2020/2/20 11:23 上午
 */
@Repository
public interface ChildRepository extends ParentRepository<Person, Long> {

    @Query("FROM Person p WHERE p.name = :name")
    Person findByName(@Param("name") String name);

    @Lock(LockModeType.NONE)
    @Query("SELECT count(*) FROM Person p")
    long getPersonCount();

    @Query(value = "SELECT AVG(p.age) FROM Person p", nativeQuery = true)
    int getAverageAge();

    @Procedure(name = "count_by_name")
    long getCountByName(@Param("name") String name);

    @Modifying
    @Query("UPDATE Person p SET p.name = :name WHERE p.id = :id")
    void changeName(@Param("id") long id, @Param("name") String name);

}
