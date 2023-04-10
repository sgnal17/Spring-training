package com.cydeo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // Employee table is created
public class Employee {

    @Id  // we defined primary key for employee table
    private int id;
    private String name;


}
