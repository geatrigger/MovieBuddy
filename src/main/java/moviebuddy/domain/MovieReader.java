package moviebuddy.domain;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public interface MovieReader {
    List<Movie> loadMovies();
}
