package com.example.testcompany.service;

import com.example.testcompany.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {

    List<EmployeeDto> findAllEmployees();

    EmployeeDto addNewEmployee(EmployeeDto employeeDto);

    EmployeeDto updateEmployee(EmployeeDto employeeDto);


    boolean deleteEmployeeByPhoneNumber(String phoneNumber);



}
