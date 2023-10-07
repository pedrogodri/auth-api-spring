package com.br.auth.authapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.auth.authapi.domain.product.Product;

public interface ProductRepository extends JpaRepository<Product, String> {
}