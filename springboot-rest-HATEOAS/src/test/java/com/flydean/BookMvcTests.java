package com.flydean;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

/**
 * @author wayne
 * @version BookMvcTests,  2021/6/17
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
class BookMvcTests {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void envEndpointNotHidden() throws Exception {
        mockMvc.perform(get("/book/1"))
                .andExpect(jsonPath("$.content.title").value("The Hobbit"));
    }
}
