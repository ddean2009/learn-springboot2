package com.flydean.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.Optional;

/**
 * @author wayne
 * @version ParentRepository,  2020/2/20 11:22 上午
 */
@NoRepositoryBean
public interface ParentRepository<T, ID extends Serializable> extends CrudRepository<T, ID> {

    Optional<T> findById(ID id);
}
