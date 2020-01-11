package com.flydean.learn.repository;

import com.flydean.learn.entity.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author wayne
 * @version BookRepository,  2020/1/10 11:18 下午
 */
public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}
