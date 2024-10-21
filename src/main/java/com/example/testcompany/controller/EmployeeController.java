package com.example.testcompany.controller;

import com.example.testcompany.dto.EmployeeDto;
import com.example.testcompany.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/employees")
    public ResponseEntity<List<EmployeeDto>> findAllEmployees(){
        List<EmployeeDto> employeeDtos = employeeService.findAllEmployees();
        return new ResponseEntity<>(employeeDtos, HttpStatus.OK);
    }

    @PostMapping("/employees")
    public ResponseEntity<EmployeeDto> addNewEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto newEmployee = employeeService.addNewEmployee(employeeDto);
        return new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
    }




}
