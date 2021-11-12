package com.contracts.contracts.repository;


import com.contracts.contracts.models.ContractStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepo extends JpaRepository<ContractStatus, Long> {
}
