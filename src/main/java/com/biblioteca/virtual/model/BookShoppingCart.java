package com.biblioteca.virtual.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@Entity
@Table(name = "BooksInShoppingCart")
public class BookShoppingCart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "Book_id")
    @NotNull
    private Book book;

    @ManyToOne
    @JoinColumn(name = "Shopping_Cart_id")
    @NotNull
    private ShoppingCart shoppingCart;

    @Column(name = "amount")
    @NotNull
    private Integer amount;
}
