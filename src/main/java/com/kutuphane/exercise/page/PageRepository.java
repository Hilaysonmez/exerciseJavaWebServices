package com.kutuphane.exercise.page;

import com.kutuphane.exercise.book.Book;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PageRepository extends JpaRepository<Page,Long> {
 //   List<Page> findByPage(Book book, Sort sort);

   // @Query("SELECT p FROM pages p where" +
   //         "" +
   //         "" +
    //        "p.page_description = ?2 " +
    //        "and p.book_id = ?1"
   // )
  //  Optional<Page> findPageByPageDesc2(Book book, String page_description);



}
