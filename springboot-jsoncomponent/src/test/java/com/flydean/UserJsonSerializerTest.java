package com.flydean;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.flydean.beans.User;
import javafx.scene.paint.Color;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author wayne
 * @version UserJsonSerializerTest,  2020/2/8 1:24 下午
 */
@JsonTest
@RunWith(SpringRunner.class)
public class UserJsonSerializerTest {

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testSerialization() throws JsonProcessingException {
        User user = new User(Color.ALICEBLUE);
        String json = objectMapper.writeValueAsString(user);

        assertEquals("{\"favoriteColor\":\"#f0f8ff\"}", json);
    }
}