package com.cydeo.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor

public class UserAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String password;
    private String username;

    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    @JoinColumn(name = "account_details_id")
    private AccountDetail accountDetail;

    public UserAccount(String email, String password, String username) {
        this.email = email;
        this.password = password;
        this.username = username;
    }
}
