

package com.kutuphane.exercise.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;



@Repository
public interface BookRepository
        extends JpaRepository<Book, Long> {

    // SELECT * FROM book where name =?
    @Query("SELECT b FROM Book b WHERE" +
            "" +
            "" +
            " b.name = ?1")
    Optional<Book> findBookByName(String name);
}
