package com.aluracursos.forumhub.domain.user.validations;

import com.aluracursos.forumhub.domain.user.UserData;
import com.aluracursos.forumhub.domain.user.UserRepository;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserEmail implements UserValidator{

    @Autowired
    UserRepository userRepository;

    public void validate(UserData userData){
        var user = userRepository.existsByEmail(userData.email());
        if(user){
            throw new ValidationException("Email already exists");
        }
    }
}
