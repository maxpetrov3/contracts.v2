package com.contracts.contracts.models;


import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Entity
@Table(name = "u_roles")
public class UserRole implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "role_name")
    private String authority;

    public UserRole() {
    }

    public UserRole(Long id, String roleName) {
        this.id = id;
        this.authority = roleName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public void setAuthority(String roleName) {
        this.authority = roleName;
    }

    @Override
    public String getAuthority() {
        return null;
    }
}
