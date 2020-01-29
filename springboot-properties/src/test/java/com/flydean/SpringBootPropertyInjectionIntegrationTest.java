package com.flydean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author wayne
 * @version SpringBootPropertyInjectionIntegrationTest,  2020/1/29 10:18 下午
 */
@RunWith(SpringRunner.class)
@SpringBootTest(properties = {"foo=bar"}, classes = PropertiesApp.class)
public class SpringBootPropertyInjectionIntegrationTest {

    @Value("${foo}")
    private String foo;

    @Test
    public void whenSpringBootPropertyProvided_thenProperlyInjected() {
        assertThat(foo).isEqualTo("bar");
    }
}
