package moviebuddy.domain;

import moviebuddy.MovieBuddyFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MovieFinderTest {
    private MovieFinder movieFinder;
    private MovieBuddyFactory movieBuddyFactory;

    @BeforeEach
    void setUp() {
        movieBuddyFactory = new MovieBuddyFactory();
        movieFinder = movieBuddyFactory.movieFinder();

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("감독 찾기")
    void directedBy() {
        // given
        // when
        List<Movie> result = movieFinder.directedBy("Michael Bay");
        // then
        assertEquals(3, result.size());
    }

    @Test
    @DisplayName("개봉년도 찾기")
    void releasedYearBy() {
        // given
        // when
        List<Movie> result = movieFinder.releasedYearBy(2015);
        // then
        assertEquals(225, result.size());
    }

    @Test
    void loadMovies() {
    }

}