package com.cydeo;

import com.cydeo.repository.DepartmentRepository;
import com.cydeo.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class QueryDemo implements CommandLineRunner {

    private final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;

    public QueryDemo(RegionRepository regionRepository, DepartmentRepository departmentRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        System.out.println("--------------------Regions------------------------");

        System.out.println("findByCountry: "+regionRepository.findByCountry("Canada"));

        System.out.println("findByCountryContaining: "+regionRepository.findByCountryContaining("United"));

        System.out.println("findByCountryContainsOrderByRegionAsc"+regionRepository.findByCountryContainsOrderByRegionAsc("United"));

        System.out.println("findTop2ByCountry"+regionRepository.findTop2ByCountry("United States"));

        System.out.println("findTopByCountryContainsOrderByRegionDesc"+regionRepository.findTopByCountryContainsOrderByRegionDesc("States"));

        System.out.println("--------------------Departments------------------------");

        System.out.println("findByDepartment"+departmentRepository.findDepartmentByDepartment("Furniture"));

        System.out.println("findDepartmentByDivision"+departmentRepository.findDepartmentByDivision("Health"));

        System.out.println("findDepartmentByDivisionEndsWithIgnoreCase"+departmentRepository.findDepartmentByDivisionEndsWithIgnoreCase("ics"));

        System.out.println("findDistinctTop3ByDivisionContainingIgnoreCase"+departmentRepository.findDistinctTop3ByDivisionContainingIgnoreCase("Hea"));
    }
}
