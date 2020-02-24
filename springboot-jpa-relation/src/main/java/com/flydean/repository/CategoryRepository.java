package com.flydean.repository;

import com.flydean.entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author wayne
 * @version CategoryRepository,  2020/2/23 10:30 下午
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {}
