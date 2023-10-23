package com.biblioteca.virtual.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@Entity
@Table(name = "address_users")
public class UserAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "idUser")
    @NotNull
    private User idUserAddress;
    @ManyToOne
    @JoinColumn(name = "idAddress")
    @NotNull
    private Address idAddress;
}
