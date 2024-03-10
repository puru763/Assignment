package com.example.demo.repository;

import com.example.demo.entity.CaseEntity;
import org.springframework.data.repository.CrudRepository;

public interface CaseRepository extends CrudRepository<CaseEntity, Long> {
}
