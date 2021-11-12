package com.contracts.contracts.repository;

import com.contracts.contracts.models.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRepo extends JpaRepository<Currency, Long> {
}
