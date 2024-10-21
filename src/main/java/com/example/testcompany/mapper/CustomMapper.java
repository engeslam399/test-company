package com.example.testcompany.mapper;

import com.example.testcompany.dto.EmployeeDto;
import com.example.testcompany.entity.Employee;

public class CustomMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return EmployeeDto.builder()
                .recId(employee.getRecId())
                .email(employee.getEmail())
                .fullName(employee.getFullName())
                .phoneNumber(employee.getPhoneNumber())
                .salary(employee.getSalary()).build();
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return Employee.builder()
                .recId(employeeDto.getRecId())
                .email(employeeDto.getEmail())
                .fullName(employeeDto.getFullName())
                .phoneNumber(employeeDto.getPhoneNumber())
                .salary(employeeDto.getSalary()).build();
    }

}
