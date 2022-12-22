package com.kutuphane.exercise.page;

import com.kutuphane.exercise.book.Book;
import jakarta.persistence.*;

@Entity
@Table(name = "pages")
public class Page {


    @Id
    @SequenceGenerator(
            name = "page_sequence",
            sequenceName = "page_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "page_sequence"
    )
    private Long id;
    //private Long book_id;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;
    private Integer page_no;
    private String page_description;

    @Override
    public String toString() {
        return "Page{" +
                "id=" + id +
                ", book=" + book +
                ", page_no=" + page_no +
                ", page_description='" + page_description + '\'' +
                '}';
    }

    public Page() {
    }

    public Page(String page_description) {
        this.page_description = page_description;
    }

    public Page(Long id, Book book, Integer page_no, String page_description) {
        this.id = id;
        this.book = book;
        this.page_no = page_no;
        this.page_description = page_description;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Page(Book book,
                Integer page_no, String page_description) {
        // this.id = id;
        this.book=book;
        this.page_no = page_no;
        this.page_description = page_description;
    }

  //  public Long getBook_id() {
  //      return book;
   // }

   // public void setBook_id(Book book) {
   //     this.book = book;
   // }

    public Integer getPage_no() {
        return page_no;
    }

    public void setPage_no(Integer page_no) {
        this.page_no = page_no;
    }

    public String getPage_description() {
        return page_description;
    }

    public void setPage_description(String page_description) {
        this.page_description = page_description;
    }
}
