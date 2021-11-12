package com.contracts.contracts.models;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "pay_rule")
public class PayRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String code;


    public PayRule(long id, String name, String code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }

    public PayRule() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
