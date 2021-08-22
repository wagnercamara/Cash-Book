package com.wagner.backendcashbook.model.repository;

import com.wagner.backendcashbook.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <UserEntity,Integer>{
}
