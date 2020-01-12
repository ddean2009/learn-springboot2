package com.flydean;

import com.flydean.bean.GenericEntity;
import com.flydean.repository.GenericEntityRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author wayne
 * @version SpringBootJPATest,  2020/1/12 7:27 下午
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class SpringBootJPATest {

    @Autowired
    private GenericEntityRepository genericEntityRepository;

    @Test
    public void givenGenericEntityRepository_whenSaveAndRetreiveEntity_thenOK() {
        GenericEntity genericEntity =
                genericEntityRepository.save(new GenericEntity("test"));
        GenericEntity foundedEntity =
                genericEntityRepository.findById(genericEntity.getId()).orElse(null);

        assertNotNull(foundedEntity);
        assertEquals(genericEntity.getValue(), foundedEntity.getValue());
    }
}
