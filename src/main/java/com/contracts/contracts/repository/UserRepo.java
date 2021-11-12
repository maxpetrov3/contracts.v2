package com.contracts.contracts.repository;


import com.contracts.contracts.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<UserModel, Long> {

    @Query(value = "SELECT * FROM users where login = ?1", nativeQuery = true)
    UserModel getByUsername(String login);
}
