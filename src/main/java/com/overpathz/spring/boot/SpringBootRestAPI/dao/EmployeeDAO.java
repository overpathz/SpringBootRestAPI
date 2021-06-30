package com.overpathz.spring.boot.SpringBootRestAPI.dao;

import com.overpathz.spring.boot.SpringBootRestAPI.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
   List<Employee> getAllEmployees();

//   void saveEmployee(Employee employee);
//
//   Employee getEmployee(int id);
//
//   void deleteEmployee(int id);
}
