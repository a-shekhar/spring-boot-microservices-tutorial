package com.aditya.springbootdemo.repository;

import com.aditya.springbootdemo.entity.EmployeeEntity;
import com.aditya.springbootdemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, String> {
}
