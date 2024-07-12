package com.aluracursos.forumhub.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, Long> {
    UserDetails findUserByEmail(String email);

    Boolean existsByEmail(String email);
}
