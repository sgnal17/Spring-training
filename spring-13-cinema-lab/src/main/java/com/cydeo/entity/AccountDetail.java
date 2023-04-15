package com.cydeo.entity;


import com.cydeo.enums.Role;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name="accountDetails")
public class AccountDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;
    private String country;
    private String city;
    private String state;
    private Integer age;
    private String postalCode;

    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToOne(mappedBy = "accountDetail")
    private UserAccount userAccount;

    public AccountDetail(String name, String address, String country, String city, String state, Integer age, String postalCode, Role role) {
        this.name = name;
        this.address = address;
        this.country = country;
        this.city = city;
        this.state = state;
        this.age = age;
        this.postalCode = postalCode;
        this.role = role;
    }
}
