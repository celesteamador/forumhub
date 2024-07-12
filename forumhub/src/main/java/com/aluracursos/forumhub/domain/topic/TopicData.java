package com.aluracursos.forumhub.domain.topic;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record TopicData(
        @NotBlank Long user,
        @NotBlank Long course,
        @NotNull String title,
        @NotNull String message
) {



}
