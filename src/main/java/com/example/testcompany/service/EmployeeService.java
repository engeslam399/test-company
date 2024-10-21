package com.example.testcompany.service;

import com.example.testcompany.dto.EmployeeDto;
import com.example.testcompany.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<EmployeeDto> findAllEmployees();

    EmployeeDto addNewEmployee(EmployeeDto employeeDto);

}
