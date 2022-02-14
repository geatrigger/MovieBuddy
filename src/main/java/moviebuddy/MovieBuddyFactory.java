package moviebuddy;

import moviebuddy.domain.CsvMovieReader;
import moviebuddy.domain.MovieFinder;
import moviebuddy.domain.MovieReader;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

@Configuration
@Import({ MovieBuddyFactory.DomainModuleConfig.class, MovieBuddyFactory.DataSourceModuleConfig.class })
public class MovieBuddyFactory {


    @Configuration
    static class DomainModuleConfig {
        @Bean
        public MovieFinder movieFinder(MovieReader movieReader) {
            return new MovieFinder(movieReader);
        }

    }

    @Configuration
    static class DataSourceModuleConfig {
        @Bean
        public MovieReader movieReader() {
            return new CsvMovieReader();
        }

    }
}
