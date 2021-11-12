package com.contracts.contracts.configurations.securityConfig;

import com.contracts.contracts.models.UserModel;
import com.contracts.contracts.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetaisService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserModel user = userRepo.getByUsername(s);

        if(user == null) {
            throw new UsernameNotFoundException("User not found");
        }

        return user;
    }
}
