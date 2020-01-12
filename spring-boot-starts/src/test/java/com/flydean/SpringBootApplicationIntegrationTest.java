package com.flydean;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;


/**
 * @author wayne
 * @version SpringBootApplicationIntegrationTest,  2020/1/12 6:56 上午
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class SpringBootApplicationIntegrationTest {
    @Autowired
    private WebApplicationContext webApplicationContext;
    private MockMvc mockMvc;

    @Before
    public void setupMockMvc() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void givenRequestHasBeenMade_whenMeetsAllOfGivenConditions_thenCorrect()
            throws Exception {
        MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
                MediaType.APPLICATION_JSON.getSubtype());
        mockMvc.perform(MockMvcRequestBuilders.get("/entity/all")).
                andExpect(MockMvcResultMatchers.status().isOk()).
                andExpect(MockMvcResultMatchers.content().contentType(contentType)).
                andExpect(jsonPath("$", hasSize(4)));
    }
}
