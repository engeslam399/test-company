package com.example.testcompany.controller;

import com.example.testcompany.constants.EmployeeConstants;
import com.example.testcompany.dto.ApiResponse;
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

    @PutMapping("/employees")
    public ResponseEntity<EmployeeDto> updateEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto updateEmployee = employeeService.updateEmployee(employeeDto);
        return new ResponseEntity<>(updateEmployee, HttpStatus.CREATED);
    }


    @DeleteMapping("/employees")
    public ResponseEntity<ApiResponse> updateEmployee(@RequestParam String phoneNumber){
        boolean isDeleted = employeeService.deleteEmployeeByPhoneNumber(phoneNumber);
        if (isDeleted){
            return new ResponseEntity<>(new ApiResponse(EmployeeConstants.STATUS_200,
                                                        EmployeeConstants.MESSAGE_417_DELETE), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(new ApiResponse(EmployeeConstants.STATUS_417,
                                                        EmployeeConstants.MESSAGE_417_DELETE), HttpStatus.EXPECTATION_FAILED);
        }
    }


}
