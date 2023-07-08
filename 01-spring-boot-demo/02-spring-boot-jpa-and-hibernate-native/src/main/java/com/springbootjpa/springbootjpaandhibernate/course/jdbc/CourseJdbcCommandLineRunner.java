package com.springbootjpa.springbootjpaandhibernate.course.jdbc;

import com.springbootjpa.springbootjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Spring Boot", "learn"));
        repository.insert(new Course(2, "Spring ", "learn"));
        repository.insert(new Course(3, "Spring MVC", "learn"));
        repository.delete(2);

        System.out.println(repository.findById(1));
        System.out.println(repository.findById(3));
    }
}
