package com.flydean.repository;

import com.flydean.entity.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * @author wayne
 * @version BookRepository,  2020/2/23 10:16 下午
 */
public interface BookRepository extends CrudRepository<Book, Long> {

     void deleteBookById(Long id);

}
