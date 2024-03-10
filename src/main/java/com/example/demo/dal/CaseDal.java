package com.example.demo.dal;

import com.example.demo.dal.entity.CaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaseDal extends JpaRepository<CaseEntity, Long> {
}
