package com.contracts.contracts.repository;



import com.contracts.contracts.models.ActivityDirection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirectionsRepo  extends JpaRepository<ActivityDirection, Long> {
}
