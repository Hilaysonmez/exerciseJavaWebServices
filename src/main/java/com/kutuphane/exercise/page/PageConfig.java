package com.kutuphane.exercise.page;

import com.kutuphane.exercise.book.Book;
import com.kutuphane.exercise.book.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class PageConfig {
    CommandLineRunner commandLineRunner(PageRepository pageRepository,
                                        BookRepository bookRepository){
        return args -> {
            Book book = new Book("hello world");
            bookRepository.save(book);

            Page page1 = new Page(book,2,"Introductiond");
            Page page2 = new Page(book,21,"Descriptions");

            pageRepository.saveAll(
                    List.of(page1,page2)
            );
        };
    }

}
