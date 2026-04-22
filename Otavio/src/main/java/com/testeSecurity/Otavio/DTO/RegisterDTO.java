package com.testeSecurity.Otavio.DTO;


import com.testeSecurity.Otavio.entity.Roles;

public record RegisterDTO(
        String login,
        String password,
        Roles role) {
}
