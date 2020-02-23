package com.flydean.repository;

import com.flydean.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author wayne
 * @version MovieRepository,  2020/1/10 11:18 下午
 */
public interface MovieRepository extends JpaRepository<Movie, Long> {

    List<Movie> findByTitleContaining(String title);
    List<Movie> findByTitleContains(String title);
    List<Movie> findByTitleIsContaining(String title);

    List<Movie> findByTitleLike(String title);

    List<Movie> findByRatingStartsWith(String rating);

    List<Movie> findByDirectorEndsWith(String director);

    List<Movie> findByTitleContainingIgnoreCase(String title);

    List<Movie> findByRatingNotContaining(String rating);

    List<Movie> findByDirectorNotLike(String director);

    @Query("SELECT m FROM Movie m WHERE m.title LIKE %:title%")
    List<Movie> searchByTitleLike(@Param("title") String title);

    @Query("SELECT m FROM Movie m WHERE m.rating LIKE ?1%")
    List<Movie> searchByRatingStartsWith(String rating);

    @Query("SELECT m FROM Movie m WHERE m.director LIKE %?#{escape([0])} escape ?#{escapeCharacter()}")
    List<Movie> searchByDirectorEndsWith(String director);
}
