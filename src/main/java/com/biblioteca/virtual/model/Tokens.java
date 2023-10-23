package com.biblioteca.virtual.model;

import com.biblioteca.virtual.enums.TokensEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter@Setter
@Entity
@Table(name = "tokens")
public class Tokens {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "type")
    private String type;
    @Column(name = "token")
    @NotNull
    private String token;
    @Column(name = "creation_date")
    @NotNull
    private LocalDate creationDate;
    @Column(name = "expiration_date")
    private LocalDate expirationDate;
    @Column(name = "status")
    private TokensEnum status;

    @ManyToOne
    @JoinColumn(name = "Users_id")
    @NotNull
    private User idUserTks;
}
