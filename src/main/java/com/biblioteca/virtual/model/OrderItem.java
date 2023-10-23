package com.biblioteca.virtual.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
@Getter@Setter
@Entity
@Table(name = "order_item")
public class OrderItem {

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
    @Column(name = "discount")
    private Float discount;

    @ManyToOne
    @JoinColumn(name = "Orders_id")
    @NotNull
    private Orders order;

    @ManyToOne
    @JoinColumn(name = "Book_id")
    @NotNull
    private Book book;

    @ManyToOne
    @JoinColumn(name = "Invoice_id")
    @NotNull
    private Invoice invoice;
}
