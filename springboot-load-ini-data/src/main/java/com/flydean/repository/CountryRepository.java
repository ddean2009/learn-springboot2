package com.flydean.repository;

import com.flydean.entity.Country;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author wayne
 * @version CountryRepository,  2020/2/2 9:47 下午
 */
public interface CountryRepository extends CrudRepository<Country, Integer> {
    List<Country> findByName(String name);
}
