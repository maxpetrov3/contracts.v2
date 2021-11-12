package com.contracts.contracts.repository;

import com.contracts.contracts.models.FmPosition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FmPositionRepo extends JpaRepository<FmPosition, Long> {
}
