package com.contracts.contracts.repository;

import com.contracts.contracts.models.PostPay;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostPayRepo extends JpaRepository<PostPay, Long> {
}
