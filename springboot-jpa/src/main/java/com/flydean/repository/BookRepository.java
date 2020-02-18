package com.flydean.repository;

import com.flydean.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

/**
 * @author wayne
 * @version BookRepository,  2020/1/10 11:18 下午
 */
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitle(String title);

    @Query("SELECT b FROM Book b WHERE LOWER(b.title) = LOWER(:title)")
    Book retrieveByTitle(@Param("title") String title);

    Optional<Book> findOneByTitle(String title);

    List<Book> findAll();

    Stream<Book> findAllByTitle(String title);

    @Async
    CompletableFuture<Book> findOneByAuthor(String author);

}
