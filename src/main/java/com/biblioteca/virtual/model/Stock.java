package com.biblioteca.virtual.model;

import com.biblioteca.virtual.enums.StockEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter@Setter
@Entity
@Table(name = "stock")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "amount")
    @NotNull
    private Integer amount;
    @Column(name = "stock_update_date")
    private LocalDate stockUpdateDate;
    @Column(name = "status")
    private StockEnum status;
    @Column(name = "sale")
    private boolean sale;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Book_id", nullable = false)
    @NotNull
    private Book book;
}
