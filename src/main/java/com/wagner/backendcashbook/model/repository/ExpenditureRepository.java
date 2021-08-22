package com.wagner.backendcashbook.model.repository;

import com.wagner.backendcashbook.model.entity.ExpenditureEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenditureRepository extends JpaRepository<ExpenditureEntity,Integer> {
}
