package com.kutuphane.exercise.book;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    public BookService(BookRepository bookRepository) {

        this.bookRepository = bookRepository;
    }

    private final BookRepository bookRepository;
    public List<Book> getBooks(){
       return bookRepository.findAll();

    }

    public void addNewBook(Book book) {
        Optional<Book> bookOptional = bookRepository.findBookByName(book.getName());
        if(bookOptional.isPresent()){
            throw new IllegalStateException("name taken");
        }

        bookRepository.save(book);

        //System.out.println(book);
    }

    public void deleteBook(Long bookId) {
        boolean exists = bookRepository.existsById(bookId);
        if(!exists) {
            throw new IllegalStateException("book with id " + bookId + " does not exists");
        }
        bookRepository.deleteById(bookId);

    }


    @Transactional
    public void updateBook(Long bookId, String name) {
        Book book = bookRepository.findById(bookId)
                .orElseThrow(() -> new IllegalStateException(
                        "book with id " + bookId + " does not exists"
                ));
        if(name != null && name.length() > 0 && !Objects.equals(book.getName(), name)){
            book.setName(name);
        }
    }
}
