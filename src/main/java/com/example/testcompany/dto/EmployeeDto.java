package com.example.testcompany.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmployeeDto {

    private Long recId;

    private String phoneNumber;

    private String fullName;

    private String email;

    private Long salary;

}
