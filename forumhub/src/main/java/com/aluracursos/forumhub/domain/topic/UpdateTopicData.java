package com.aluracursos.forumhub.domain.topic;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UpdateTopicData(
        @NotNull Long id,
        @NotBlank String title,
        @NotBlank String message,
        @NotNull Long user,
        @NotNull Long course
) {
}
