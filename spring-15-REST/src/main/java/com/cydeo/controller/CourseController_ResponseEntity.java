package com.cydeo.controller;


import com.cydeo.dto.CourseDTO;
import com.cydeo.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses/api/v2 ")
public class CourseController_ResponseEntity {

    private final CourseService courseService;


    public CourseController_ResponseEntity(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public ResponseEntity<List<CourseDTO>> getAllCourses(){
        return ResponseEntity
                .status(HttpStatus.ACCEPTED) //manipulating http status code 202
                .header("Version","Cydeo.V2")
                .header("Operation","Get")
                .body(courseService.getCourses());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CourseDTO> getCourseById(@PathVariable("id") Long id){
        return ResponseEntity.ok(courseService.getCourseById(id)); // if we don't want to add header or anything
    }

    @GetMapping("/category/{categoryName}")
    public ResponseEntity<List<CourseDTO>> getCourseByCategory(@PathVariable("categoryName") String name){
        return ResponseEntity.ok(courseService.getCoursesByCategory(name));
    }

    @PostMapping
    public ResponseEntity<CourseDTO> createCourse(@RequestBody CourseDTO dto){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .header("Operation","CREATE")
                .body(courseService.createCourse(dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCourseById(@PathVariable("id") Long id){
        courseService.deleteCourseById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateCourse(@PathVariable("id") Long id,@RequestBody CourseDTO dto){
        courseService.updateCourse(id,dto);
        return ResponseEntity.noContent().build();
    }





}
