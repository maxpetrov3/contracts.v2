package com.contracts.contracts.repository;

import com.contracts.contracts.models.Tender;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TenderRepo extends JpaRepository<Tender, Long> {
}
