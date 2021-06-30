package com.overpathz.spring.boot.SpringBootRestAPI.service;

import com.overpathz.spring.boot.SpringBootRestAPI.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

//    void saveEmployee(Employee employee);
//
//    Employee getEmployee(int id);
//
//    void deleteEmployee(int id);
}
