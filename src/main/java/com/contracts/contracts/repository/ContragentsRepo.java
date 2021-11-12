package com.contracts.contracts.repository;

import com.contracts.contracts.models.Contragent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ContragentsRepo extends JpaRepository<Contragent, Long> {

    @Query(value = "SELECT * FROM contragent WHERE contragent_id LIKE ?1"+"%", nativeQuery = true)
    List<Contragent> serchContragent(String text);
}
