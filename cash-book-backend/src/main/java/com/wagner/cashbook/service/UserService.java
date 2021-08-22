package com.wagner.cashbook.service;

import com.wagner.cashbook.model.UserModel;
import com.wagner.cashbook.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    final
    UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void toSaveUser(UserModel userModel){
        validateUser(userModel);
        this.userRepository.persist(userModel);
    }

    public void validateUser(UserModel userModel){
        // apply validations


    }

}
