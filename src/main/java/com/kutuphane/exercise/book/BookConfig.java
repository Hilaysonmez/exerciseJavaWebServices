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
            Book mariam = new Book("Mariamhobalabakam" );
            Book alex = new Book("Alexhobalabakam" );

            repository.saveAll(
                    List.of(mariam,alex)
            );
        };
    }
}
