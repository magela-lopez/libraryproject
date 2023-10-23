package com.biblioteca.virtual.repository;

import com.biblioteca.virtual.model.BookShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookShoppingCartRepository extends JpaRepository<BookShoppingCart, Integer> {
}
