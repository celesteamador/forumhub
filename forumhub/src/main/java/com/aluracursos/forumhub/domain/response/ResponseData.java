package com.aluracursos.forumhub.domain.response;

import com.aluracursos.forumhub.domain.topic.Topic;
import com.aluracursos.forumhub.domain.user.User;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ResponseData(
        @NotNull User user,
        @NotNull Topic topic,
        @NotBlank String message,
        @NotBlank Boolean solution


) {




}
