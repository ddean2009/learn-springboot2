package com.flydean;

import com.flydean.app.AutoconfigurationApplication;
import com.flydean.app.MyUser;
import com.flydean.repository.MyUserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author wayne
 * @version AutoconfigurationTest,  2020/1/22 11:34 下午
 */
@RunWith(SpringRunner.class)
@SpringBootTest(
        classes = AutoconfigurationApplication.class)
@EnableJpaRepositories(
        basePackages = { "com.flydean.repository" })
public class AutoconfigurationTest {

    @Autowired
    private MyUserRepository userRepository;

    @Test
    public void whenSaveUser_thenOk() {
        MyUser user = new MyUser("user@email.com");
        userRepository.save(user);
    }
}
