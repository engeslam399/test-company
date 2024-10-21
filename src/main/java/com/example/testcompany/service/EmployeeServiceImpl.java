package com.example.testcompany.service;

import com.example.testcompany.dto.EmployeeDto;
import com.example.testcompany.entity.Employee;
import com.example.testcompany.mapper.CustomMapper;
import com.example.testcompany.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;

    @Override
    public List<EmployeeDto> findAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        List<EmployeeDto> employeeDtos = employees.stream()
                .map(employee -> CustomMapper.mapToEmployeeDto(employee))
                .collect(Collectors.toList());
        return employeeDtos;
    }

    @Override
    public EmployeeDto addNewEmployee(EmployeeDto employeeDto) {
        Employee employee = CustomMapper.mapToEmployee(employeeDto);
        return CustomMapper.mapToEmployeeDto(employeeRepository.save(employee));
    }


}
