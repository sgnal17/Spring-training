package com.cydeo.repository;

import com.cydeo.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // we don't have to put after some spring update
public interface CarRepository extends JpaRepository<Car,Long> {

}
