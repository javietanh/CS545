package edu.mum.employeerestful.service;

import edu.mum.employeerestful.domain.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getEmployees();
    void addEmployee(Employee employee);
}
