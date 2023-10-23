package com.biblioteca.virtual.model;

import com.biblioteca.virtual.enums.ShoppingCartEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter@Setter
@Entity
@Table(name = "shopping_cart")
public class ShoppingCart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "amount")
    @NotNull
    private Integer amount;
    @Column(name = "unit_price")
    @NotNull
    private Float unitPrice;
    @Column(name = "subtotal")
    @NotNull
    private Float subtotal;
    @Column(name = "status")
    @NotNull
    private ShoppingCartEnum status;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Users_id", nullable = false)
    @NotNull
    private User idUserSC;

    @OneToMany(mappedBy = "shoppingCart")
    private List<BookShoppingCart> booksShop;

}
