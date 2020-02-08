package com.flydean;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.flydean.beans.User;
import javafx.scene.paint.Color;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * @author wayne
 * @version UserJsonDeserializerTest,  2020/2/8 1:25 下午
 */
@JsonTest
@RunWith(SpringRunner.class)
public class UserJsonDeserializerTest {

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testDeserialize() throws IOException {
        String json = "{\"favoriteColor\":\"#f0f8ff\"}";
        User user = objectMapper.readValue(json, User.class);

        assertEquals(Color.ALICEBLUE, user.getFavoriteColor());
    }
}

