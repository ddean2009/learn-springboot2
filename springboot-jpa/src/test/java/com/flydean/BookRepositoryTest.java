package com.flydean;

import com.flydean.entity.Book;
import com.flydean.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

/**
 * @author wayne
 * @version BookRepositoryTest,  2020/2/15 10:16 上午
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {JpaApp.class})
public class BookRepositoryTest {

    @Autowired
    private BookRepository bookRepository;

    @Test
    @Transactional(readOnly=false)
    public void testBookRepository(){
        Book book = new Book();
        book.setTitle(randomAlphabetic(10));
        book.setAuthor(randomAlphabetic(15));

        bookRepository.save(book);

       bookRepository.findByTitle(book.getTitle()).forEach(e -> log.info(e.toString()));
       log.info(bookRepository.retrieveByTitle(book.getTitle()).toString());
    }
}
