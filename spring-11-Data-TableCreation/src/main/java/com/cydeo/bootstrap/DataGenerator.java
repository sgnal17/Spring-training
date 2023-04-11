package com.cydeo.bootstrap;

import com.cydeo.entity.Car;
import com.cydeo.entity.Department;
import com.cydeo.entity.Employee;
import com.cydeo.enums.Gender;
import com.cydeo.repository.CarRepository;
import com.cydeo.repository.DepartmentRepository;
import com.cydeo.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataGenerator implements CommandLineRunner {

    private final CarRepository carRepository;
    private final EmployeeRepository employeeRepository;
    private final DepartmentRepository departmentRepository;

    public DataGenerator(CarRepository carRepository, EmployeeRepository employeeRepository, DepartmentRepository departmentRepository) {
        this.carRepository = carRepository;
        this.employeeRepository = employeeRepository;

        this.departmentRepository = departmentRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Car c1 = new Car("Bmw", "M3");
        Car c2 = new Car("Honda", "Civic");
        Car c3 = new Car("Toyota", "Corolla");

        carRepository.save(c1);
        carRepository.save(c2);
        carRepository.save(c3);

        Employee employee1 = new Employee("ysf", "ackgz", "dsasd@sada.com", LocalDate.of(2023, 9, 17), Gender.MALE, 89000);
        Department department1 = new Department("It", "da");

        employeeRepository.save(employee1);
        departmentRepository.save(department1);

    }
}
