package com.flydean.learn;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author wayne
 * @version SpringContextTest,  2020/1/10 11:28 下午
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class SpringContextTest {

    @Test
    public void contextLoads() {
        log.info("contextLoads");
    }
}
