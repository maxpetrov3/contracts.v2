package com.contracts.contracts.controllers;

import com.contracts.contracts.models.UserModel;
import com.contracts.contracts.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/api/v1/")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping("/users")
    public List<UserModel> getAllUsers(){
        return userRepo.findAll();
    }

    @PostMapping("/saveUser")
    public void saveUser(@RequestBody UserModel user){
        System.out.println(user.toString());
        userRepo.saveAndFlush(user);
    }
}
