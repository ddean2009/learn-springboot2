package com.flydean.repository;

import com.flydean.entity.Book;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @author wayne
 * @version BookRepository,  2020/2/23 10:16 下午
 */
public interface BookRepository extends CrudRepository<Book, Long> {
    long deleteByTitle(String title);

    @Modifying
    @Query("delete from Book b where b.title=:title")
    void deleteBooks(@Param("title") String title);
}
