package com.contracts.contracts.repository;

import com.contracts.contracts.models.CostType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CostTypeRepo extends JpaRepository<CostType, Long> {
}
