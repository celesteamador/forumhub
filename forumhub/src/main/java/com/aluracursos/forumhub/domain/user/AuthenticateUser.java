package com.aluracursos.forumhub.domain.user;

import jakarta.validation.constraints.NotBlank;

public record AuthenticateUser(
        @NotBlank String email,
        @NotBlank String password
) {
}
