package com.biblioteca.virtual.model;

import com.biblioteca.virtual.enums.OrdersEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter@Setter
@Entity
@Table(name = "orders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "date_order")
    @NotNull
    private LocalDate dateOrder;
    @Column(name = "delivery_date")
    private LocalDate deliveryDate;
    @Column(name = "order_status")
    @NotNull
    private OrdersEnum orderStatus;
    @Column(name = "total_price")
    @NotNull
    private Float totalPrice;
    @JoinColumn(name = "Users_id")
    @ManyToOne
    @NotNull
    private User idUser;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItemList;

    @OneToOne(mappedBy = "idOrder",cascade = CascadeType.ALL, orphanRemoval = true)
    private Invoice invoice;

}
