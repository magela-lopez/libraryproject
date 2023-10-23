package com.biblioteca.virtual.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter@Setter
@Entity
@Table(name = "invoice")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "number")
    @NotNull
    private String numberInvoice;
    @Column(name = "date_of_issue")
    @NotNull
    private LocalDate issueDate;
    @Column(name = "total_price")
    @NotNull
    private Float totalPrice;
    @Column(name = "taxes")
    private Float taxes;
    @Column( name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "Users_id")
    @NotNull
    private User user;

    @OneToMany(mappedBy = "invoice")
    private List<OrderItem> orderItemList;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Orders_id", nullable = false)
    @NotNull
    private Orders idOrder;
}
