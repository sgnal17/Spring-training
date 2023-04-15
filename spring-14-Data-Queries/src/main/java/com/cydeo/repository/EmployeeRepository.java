package com.cydeo.repository;

import com.cydeo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    //display all employees with email address
    List<Employee> findByEmail(String email);

    //display all employees with firstName ="" and lastName="",
    //also show all employees with an email address
    List<Employee> findByFirstNameAndLastNameOrEmail(String name,String lastName,String email);

    //display all employees where last name starts with ""
    List<Employee> findByLastNameStartsWith(String str);

    //display all employees with salary greater than ""
    List<Employee> findBySalaryGreaterThan(BigDecimal salary);

    //display all employees with salary less than ""
    List<Employee> findBySalaryLessThan(BigDecimal salary);

    //display all employees that has been hired between "" date and "" date
    List<Employee> findByHireDateBetween(LocalDate startDate,LocalDate endDate);

    //display all employees where salaries greater and equal to "" in order(salary)
    List<Employee> findBySalaryGreaterThanEqualOrderBySalary(BigDecimal salary);

    //display top unique 3 employees that is making less than ""
    List<Employee> findDistinctTop3BySalaryLessThan(BigDecimal salary);

    //display all employees that don't have email address
    List<Employee> findByEmailNull();






}
