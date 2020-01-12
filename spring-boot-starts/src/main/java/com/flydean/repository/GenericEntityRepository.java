package com.flydean.repository;

import com.flydean.bean.GenericEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * @author wayne
 * @version GenericEntityRepository,  2020/1/12 7:27 下午
 */
public interface GenericEntityRepository extends JpaRepository<GenericEntity, Long> {}
