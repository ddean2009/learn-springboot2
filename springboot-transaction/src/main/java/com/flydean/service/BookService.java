package com.flydean.service;

import com.flydean.repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author wayne
 * @version BookService,  2020/2/26 9:41 下午
 */
@Service
public class BookService {

    private BookRepository bookRepository;


    @Transactional
    public void deleteBookWithDefaultTransaction(Long id) {
        bookRepository.deleteBookById(id);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteBookWithRequired(Long id) {
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public void deleteBookWithSupports(Long id) {
    }

    @Transactional(propagation = Propagation.MANDATORY)
    public void deleteBookWithMandatory(Long id) {
    }

    @Transactional(propagation = Propagation.NEVER)
    public void deleteBookWithNever(Long id) {
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void deleteBookWithNotSupported(Long id) {
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void deleteBookWithRequiresNew(Long id){
    }

    @Transactional(propagation = Propagation.NESTED)
    public void deleteBookWithNested(Long id){
    }

    @Transactional(isolation = Isolation.READ_UNCOMMITTED)
    public void deleteBookWithReadUncommitted(Long id){
    }

    @Transactional(isolation = Isolation.READ_COMMITTED)
    public void deleteBookWithReadCommitted(Long id){
    }

    @Transactional(isolation = Isolation.REPEATABLE_READ)
    public void deleteBookWithRepeatableRead(Long id){
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public void deleteBookWithSerializable(Long id){
    }
}
