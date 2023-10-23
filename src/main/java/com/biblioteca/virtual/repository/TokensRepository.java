package com.biblioteca.virtual.repository;

import com.biblioteca.virtual.model.Tokens;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokensRepository extends JpaRepository<Tokens, Integer> {
}
