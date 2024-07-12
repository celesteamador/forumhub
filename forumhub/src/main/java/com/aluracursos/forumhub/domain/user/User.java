package com.aluracursos.forumhub.domain.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.sql.Update;
import org.springframework.security.crypto.password.PasswordEncoder;

@Table(name = "users")
@Entity(name = "User")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(unique = true)
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private Profile profile;

    public User(String name, String email, String password, Profile profile) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.profile = profile;
    }

    public void updateUser(UpdateUserData updateUserData, PasswordEncoder passwordEncoder) {
        this.name = updateUserData.name();
        this.email = updateUserData.email();
        this.password = passwordEncoder.encode(updateUserData.password());
        this.profile = updateUserData.profile();
    }

}
