package com.wagner.backendcashbook.model.repository;

import com.wagner.backendcashbook.model.entity.CreditorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditorRepository extends JpaRepository<CreditorEntity,Integer> {
}
