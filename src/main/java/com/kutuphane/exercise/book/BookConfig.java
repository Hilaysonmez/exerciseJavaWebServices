package com.kutuphane.exercise.book;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BookConfig {

    @Bean
    CommandLineRunner commandLineRunner(BookRepository repository){
        return args -> {
            Book java101 = new Book("Java101" );
            Book python101 = new Book("Python 101" );

            repository.saveAll(
                    List.of(java101,python101)

            );
        };
    }
}
