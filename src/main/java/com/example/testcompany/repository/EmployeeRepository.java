package com.example.testcompany.repository;

import com.example.testcompany.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Optional<Employee> findByPhoneNumber(String phoneNumber);

    void deleteByPhoneNumber(String phoneNumber);

}
