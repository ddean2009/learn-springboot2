package com.flydean;

import com.flydean.repository.CountryRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;


/**
 * @author wayne
 * @version SpringBootInitialLoadIntegrationTest,  2020/2/2 9:45 下午
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = LoadIniDataApp.class)
public class SpringBootInitialLoadIntegrationTest {

    @Autowired
    private CountryRepository countryRepository;

    @Test
    public void testInitDataForTestClass() {
        assertEquals(4, countryRepository.count());
    }

    @Test
    @Sql({"classpath:new_country.sql"})
    @Sql(scripts = {"classpath:new_country2.sql"},
            config = @SqlConfig(encoding = "utf-8", transactionMode = SqlConfig.TransactionMode.ISOLATED))
    public void testLoadDataForTestCase() {
        assertEquals(6, countryRepository.count());
    }


}
