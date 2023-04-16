package com.cydeo.repository;

import com.cydeo.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.stream.Stream;

public interface CourseRepository extends JpaRepository<Course,Long> {


    //find all courses by category
    List<Course> findByCategory(String category);

    //find all courses by category and order the entities name
    List<Course> findByCategoryOrderByName(String category);

    //Checks if a course with the supplied name exists.return true if exists otherwise return false
    boolean existsByName(String name);

    //Returns the count of courses for the given category
    int countByCategory(String category);

    //find all the courses that start with the given course name string
    List<Course> findByNameStartingWith(String name);

    //find all courses by category and returns a stream
    Stream<Course> streamAllByCategory(String category);

    //
    @Query("select c from Course c where c.category = :category and c.rating > :rating")
    List<Course> retrieveAllByCategoryAndRatingGreaterThan(@Param("category") String category,@Param("rating") Integer rating );







}
