package com.aluracursos.forumhub.domain.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UpdateUserData(
        @NotNull Long id,
        @NotBlank String name,
        @NotBlank @Email String email,
        @NotBlank String password,
        @NotNull Profile profile
) {
}
