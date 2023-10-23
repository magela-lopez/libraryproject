package com.biblioteca.virtual.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter@Setter
@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "codeISBN")
    @NotNull
    private String codeISBN;
    @Column(name = "name")
    @NotNull
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    @NotNull
    private Float price;
    @Column(name = "language")
    private String language;
    @Column(name = "edition")
    private String edition;
    @Column(name = "availability")
    @NotNull
    private boolean availability;

    @JoinColumn(name = "Category_id")
    @ManyToOne
    @NotNull
    private Category category;

    @OneToOne(mappedBy = "book", cascade = CascadeType.ALL, orphanRemoval = true)
    private Stock stock;

    @OneToMany(mappedBy = "book")
    private List<BookShoppingCart> booksShop;

}
