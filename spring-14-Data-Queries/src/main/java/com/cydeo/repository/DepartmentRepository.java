package com.cydeo.repository;

import com.cydeo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department,String> {
    //Display all departments in the Furniture Department
    List<Department> findDepartmentByDepartment(String department);

    //Display all departments in Health division

     List<Department> findDepartmentByDivision(String division);
     List<Department> findDepartmentByDivisionIs(String division);
     List<Department> findDepartmentByDivisionEquals(String division);

     //Display all departments with division name ends with 'ics'

    List<Department> findDepartmentByDivisionEndsWithIgnoreCase(String str);

    //Display top 3 departments with division name includes 'Hea' without duplicates

    List<Department> findDistinctTop3ByDivisionContainingIgnoreCase(String str);

    //
    @Query("select d from Department d where d.division in ?1")
    List<Department> getDepartmentByDivision(List<String> division);

}
