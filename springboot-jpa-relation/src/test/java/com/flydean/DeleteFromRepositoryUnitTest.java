package com.flydean;

import com.flydean.repository.BookRepository;
import com.flydean.repository.CategoryRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

/**
 * @author wayne
 * @version DeleteFromRepositoryUnitTest,  2020/2/23 10:18 下午
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {JpaRelationApp.class})
public class DeleteFromRepositoryUnitTest {

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    @Test
    public void testInitDataForTestClass() {
        assertEquals(2, bookRepository.count());
    }

    @Test
    public void whenDeleteByIdFromRepository_thenDeletingShouldBeSuccessful() {
        assertThat(bookRepository.count()).isEqualTo(2);
        bookRepository.deleteById(1L);
        assertThat(bookRepository.count()).isEqualTo(1);
    }

    @Test
    public void whenDeleteAllFromRepository_thenRepositoryShouldBeEmpty() {
        bookRepository.deleteAll();
        assertThat(bookRepository.count()).isEqualTo(0);
    }

    @Test
    @Transactional
    public void whenDeleteFromDerivedQuery_thenDeletingShouldBeSuccessful() {
        long deletedRecords = bookRepository.deleteByTitle("The Hobbit");
        assertThat(deletedRecords).isEqualTo(1);
    }

    @Test
    @Transactional
    public void whenDeleteFromCustomQuery_thenDeletingShouldBeSuccessful() {
        bookRepository.deleteBooks("The Hobbit");
    assertThat(bookRepository.count()).isEqualTo(1);
    }

    @Test
    public void whenDeletingCategories_thenBooksShouldAlsoBeDeleted() {
        categoryRepository.deleteAll();
        assertThat(bookRepository.count()).isEqualTo(0);
        assertThat(categoryRepository.count()).isEqualTo(0);
    }

    @Test
    public void whenDeletingBooks_thenCategoriesShouldAlsoBeDeleted() {
        bookRepository.deleteAll();
        assertThat(bookRepository.count()).isEqualTo(0);
        assertThat(categoryRepository.count()).isEqualTo(1);
    }


}
