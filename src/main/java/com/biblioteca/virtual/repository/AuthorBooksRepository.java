package com.biblioteca.virtual.repository;

import com.biblioteca.virtual.model.AuthorsBooks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorBooksRepository extends JpaRepository<AuthorsBooks, Integer> {
}
