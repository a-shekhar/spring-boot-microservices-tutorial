package com.springboot.springbootintro;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourse(){
        return Arrays.asList(
                new Course(1, "Learn Aws", "learn"),
                new Course(2, "Learn Azure", "learn"),
                new Course(3, "Learn GCP", "learn")
        );
    }
}
