package moviebuddy.domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JaxbMovieReaderTest {
    MovieReader movieReader;

    @BeforeEach
    void setUp() {
        movieReader = new JaxbMovieReader();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("XML로 읽기")
    void loadMovies() {
        List<Movie> movies = movieReader.loadMovies();
        assertEquals(1375, movies.size());
    }
}