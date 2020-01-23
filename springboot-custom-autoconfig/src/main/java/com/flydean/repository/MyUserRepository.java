package com.flydean.repository;

import com.flydean.app.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wayne
 * @version MyUserRepository,  2020/1/22 11:31 下午
 */
public interface MyUserRepository
        extends JpaRepository<MyUser, String> { }