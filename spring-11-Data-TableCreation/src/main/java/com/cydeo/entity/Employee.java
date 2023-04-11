package com.cydeo.entity;

import com.cydeo.enums.Gender;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDate;

@Entity // Employee table is created
@Table(name = "employees")
@NoArgsConstructor
public class Employee {

    @Id  // we defined primary key for employee table
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger employeeId;
    private String firstName;
    private String lastName;
    private String email;

    @Column(columnDefinition = "date")
    private LocalDate hireDate;

    @Enumerated(EnumType.STRING)
    private Gender gender;
    private int salary;

    public Employee(String firstName, String lastName, String email, LocalDate hireDate, Gender gender, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.hireDate = hireDate;
        this.gender = gender;
        this.salary = salary;
    }
}
