package com.biblioteca.virtual.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "authors_books")
@Setter@Getter
public class AuthorsBooks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "Book_id")
    private Book idBook;

    @ManyToOne
    @JoinColumn(name = "Author_id")
    private Author idAuthor;

}
