package com.flydean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * @author wayne
 * @version TestRestTemplateTest,  2020/1/25 10:32 下午
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestRestTemplateApp.class)
public class TestRestTemplateTest {

    private static final String FOO_RESOURCE_URL = "";
    private static final String URL_SECURED_BY_AUTHENTICATION = "";
    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void testGet (){
        TestRestTemplate testRestTemplate = new TestRestTemplate();
        ResponseEntity<String> response = testRestTemplate.
                getForEntity(FOO_RESOURCE_URL + "/1", String.class);

        assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
    }

    @Test
    public void testBasicAuth(){
        TestRestTemplate testRestTemplate
                = new TestRestTemplate("user", "passwd");
        ResponseEntity<String> response = testRestTemplate.
                getForEntity(URL_SECURED_BY_AUTHENTICATION, String.class);

        assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
    }

    @Test
    public void testHttpClientOption(){
        TestRestTemplate testRestTemplate = new TestRestTemplate("user",
                "passwd", TestRestTemplate.HttpClientOption.ENABLE_COOKIES);
        ResponseEntity<String> response = testRestTemplate.
                getForEntity(URL_SECURED_BY_AUTHENTICATION, String.class);

        assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
    }

    @Test
    public void testWithBasicAuthMethod(){
        TestRestTemplate testRestTemplate = new TestRestTemplate();
        ResponseEntity<String> response = testRestTemplate.withBasicAuth(
                "user", "passwd").getForEntity(URL_SECURED_BY_AUTHENTICATION,
                String.class);

        assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
    }

    @Test
    public void testWithRestTemplateBuilder(){
        RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
        restTemplateBuilder.configure(testRestTemplate.getRestTemplate());
        TestRestTemplate testRestTemplate = new TestRestTemplate(restTemplateBuilder);
        ResponseEntity<String> response = testRestTemplate.getForEntity(
                FOO_RESOURCE_URL + "/1", String.class);

        assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
    }

}
