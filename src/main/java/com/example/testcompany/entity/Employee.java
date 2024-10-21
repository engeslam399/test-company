package com.example.testcompany.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "t_employees")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recId;

    private String phoneNumber;

    private String fullName;

    private String email;

    private Long salary;

}
