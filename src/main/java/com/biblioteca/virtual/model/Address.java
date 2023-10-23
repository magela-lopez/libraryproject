package com.biblioteca.virtual.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter@Setter
@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cep")
    @NotNull
    private String CEP;
    @Column(name = "department")
    @NotNull
    private String department;
    @Column(name = "city")
    @NotNull
    private String city;
    @Column(name = "neighborhood")
    @NotNull
    private String neighborhood;
    @Column(name = "street")
    @NotNull
    private String street;
    @Column(name = "number")
    @NotNull
    private String number;
    @Column(name = "description")
    @NotNull
    private String description;

    @OneToMany(mappedBy = "idAddress")
    private List<UserAddress> addresses;

}
