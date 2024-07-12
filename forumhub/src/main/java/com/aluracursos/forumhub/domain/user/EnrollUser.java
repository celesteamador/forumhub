package com.aluracursos.forumhub.domain.user;

public record EnrollUser(
        String name,
        String email,
        Profile profile
) {
    public EnrollUser(User user) {
        this(user.getName(), user.getEmail(), user.getProfile());
    }
}
