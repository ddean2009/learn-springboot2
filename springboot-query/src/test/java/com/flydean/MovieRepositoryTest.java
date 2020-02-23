package com.flydean;

import com.flydean.entity.Movie;
import com.flydean.repository.MovieRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author wayne
 * @version MovieRepositoryTest,  2020/2/23 7:21 下午
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {QueryApp.class})
public class MovieRepositoryTest {

    @Autowired
    private MovieRepository movieRepository;

    @Test
    public void TestMovieQuery(){
        List<Movie> results = movieRepository.findByTitleContaining("in");
        assertEquals(3, results.size());

        results = movieRepository.findByTitleIsContaining("in");
        assertEquals(3, results.size());

        results = movieRepository.findByTitleContains("in");
        assertEquals(3, results.size());

        results = movieRepository.findByTitleLike("%in%");
        assertEquals(3, results.size());

        results = movieRepository.findByRatingStartsWith("PG");
        assertEquals(6, results.size());

        results = movieRepository.findByDirectorEndsWith("Burton");
        assertEquals(1, results.size());

        results = movieRepository.findByTitleContainingIgnoreCase("the");
        assertEquals(2, results.size());

        results = movieRepository.findByRatingNotContaining("PG");
        assertEquals(1, results.size());

        results = movieRepository.findByDirectorNotLike("An%");
        assertEquals(5, results.size());

        results = movieRepository.searchByRatingStartsWith("PG");
        assertEquals(6, results.size());

        results = movieRepository.searchByDirectorEndsWith("Burton");
        assertEquals(1, results.size());
    }
}
