package com.biblioteca.virtual.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;
import java.util.List;

@Getter@Setter
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    @NotNull
    private String name;
    @Column(name = "surname")
    @NotNull
    private String surname;
    @Column(name = "cpf")
    @NotNull
    @CPF
    private String cpf;
    @Column(name = "password")
    @NotNull
    private String password;
    @Column(name = "email")
    @NotNull
    @Email
    private String email;
    @Column(name = "date_of_birth")
    @NotNull
    private LocalDate dateOfBirth;
    @Column(name = "phone")
    private String phone;

    @OneToMany(mappedBy = "user")
    private List<Invoice> invoices;

    @OneToMany(mappedBy = "idUser")
    private List<Orders> orders;

    @OneToOne(mappedBy = "idUserSC", cascade = CascadeType.ALL, orphanRemoval = true)
    private ShoppingCart shoppingCart;

    @OneToMany(mappedBy = "idUserTks")
    private List<Tokens> tokens;

    @OneToMany(mappedBy = "idUserAddress")
    private List<UserAddress> addresses;
}
