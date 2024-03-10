package com.example.demo.dal.repository;

import com.example.demo.dal.entity.CaseEntity;
import org.springframework.data.repository.CrudRepository;

public interface CaseRepository extends CrudRepository<CaseEntity, Long> {
}
