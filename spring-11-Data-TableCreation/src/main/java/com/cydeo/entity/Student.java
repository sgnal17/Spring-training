package com.cydeo.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name="students") // it changes table name
public class Student { // table name is going to start with lower case -->> student
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // it crates id for us
    private Long id;
    //when we use field with camel case column is going to be created as first_name
    @Column(name="studentFirstName")
    private String firstName;
    private String lastName;
    private String email;

    @Column(columnDefinition = "DATE")
    private LocalDate birthDate;
    @Column(columnDefinition = "TIME")
    private LocalTime birthTime;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime birthDateTime;

}
