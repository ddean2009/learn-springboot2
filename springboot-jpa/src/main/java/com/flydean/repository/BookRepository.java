package com.flydean.repository;

import com.flydean.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author wayne
 * @version BookRepository,  2020/1/10 11:18 下午
 */
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitle(String title);

    @Query("SELECT b FROM Book b WHERE LOWER(b.title) = LOWER(:title)")
    Book retrieveByTitle(@Param("title") String title);
}
