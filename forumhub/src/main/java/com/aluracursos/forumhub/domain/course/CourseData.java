package com.aluracursos.forumhub.domain.course;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CourseData(
        @NotBlank String name,
        @NotNull Category category
) {
}
