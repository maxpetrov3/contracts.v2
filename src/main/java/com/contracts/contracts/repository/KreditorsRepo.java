package com.contracts.contracts.repository;


import com.contracts.contracts.models.Kreditor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KreditorsRepo extends JpaRepository<Kreditor, Long> {
}
