package com.springbootjpa.springbootjpaandhibernate.course.jdbc;

import com.springbootjpa.springbootjpaandhibernate.course.Course;
import com.springbootjpa.springbootjpaandhibernate.course.jpa.CourseJpaRepository;
import com.springbootjpa.springbootjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    /* @Autowired
    private CourseJpaRepository repository;



    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Spring Boot", "learn"));
        repository.insert(new Course(2, "Spring ", "learn"));
        repository.insert(new Course(3, "Spring MVC", "learn"));
        repository.delete(2);

        System.out.println(repository.findById(1));
        System.out.println(repository.findById(3));
    }


     */

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Spring Boot", "learn1"));
        repository.save(new Course(2, "Spring ", "learn2"));
        repository.save(new Course(3, "Spring MVC", "learn3"));

        repository.deleteById(2L);

        System.out.println(repository.findById(1L));
        System.out.println(repository.findById(3L));

        System.out.println(repository.findAll());
        System.out.println(repository.count());

        System.out.println(repository.findByAuthor("learn3"));
        System.out.println(repository.findByName("Spring Boot"));
    }

}
