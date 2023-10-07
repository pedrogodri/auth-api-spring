package com.br.auth.authapi.domain.product;

public record ProductRequestDTO(
        String name,
        Integer price
) {
}