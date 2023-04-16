package com.cydeo.repository;

import com.cydeo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

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

    //---------------JPQL(Java Persistence Query Language)---------------

    @Query("select e from Employee e where e.email='amcnee1@google.es'")
    Employee getEmployeeDetail();

    @Query("select e from Employee e where e.email='amcnee1@google.es'")
    Employee getEmployeeSalary();

    //Not equal
    @Query("select e from Employee e where e.salary <> ?1") //positional parameter
    List<Employee> getEmployeeSalaryNotEqual(BigDecimal salary);

    //Like / Contains / StartsWith / EndsWith
    @Query("select e from Employee e where e.firstName like ?1 ")
    List<Employee> getEmployeeFirstNameLike(String pattern);

    //Less than
    @Query("select e from Employee e where e.salary < ?1")
    List<Employee> getEmployeeSalaryLessThan(BigDecimal salary);

    //get employee firstName salary Greater than ""
    @Query("select e.firstName from Employee where salary > ?1")
    List<String> getEmployeeFirstNameSalaryGreaterThan(BigDecimal salary);

    //between
    @Query("select e from Employee e where e.salary between ?1 and ?2")
    List<Employee> getEmployeeSalaryBetWeen(BigDecimal salary1,BigDecimal salary2);

    //before
    @Query("select e from Employee e where e.hireDate < ?1")
    List<Employee> getEmployeeHireDateBefore(LocalDate date);

    //is null
    @Query("select e from Employee e where e.email is null")
    List<Employee> getEmployeeEmailIsNull();

    //is not null
    @Query("select e from Employee e where e.email is not null")
    List<Employee> getEmployeeEmailIsNotNull();

    //sorting in asc order(salary)
    @Query("select e from Employee e order by e.salary ")
    List<Employee> getEmployeeSalaryOrderAsc();

    //sorting in desc order(salary)
    @Query("select e from Employee e order by e.salary desc ")
    List<Employee> getEmployeeSalaryOrderDesc();

    //----------------------Native Query-------------------

    @Query(value="select * from employees where salary=?1",nativeQuery = true)
    List<Employee> getEmployeeBySalary(BigDecimal salary);

    //----------------Named parameter-------------

    @Query("select e from Employee e where e.salary= :salary")
    List<Employee> retrieveEmployeeSalary(@Param("salary") BigDecimal salary);






}
