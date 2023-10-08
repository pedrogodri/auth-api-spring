package com.br.auth.authapi.domain.user;

public record RegisterDTO(String login, String password, UserRole role) {
}
