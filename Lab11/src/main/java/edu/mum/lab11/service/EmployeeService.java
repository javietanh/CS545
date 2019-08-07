package edu.mum.lab11.service;

import edu.mum.lab11.domain.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getEmployees();
    Employee addEmployee(Employee employee);
    List<Employee> getEmployeeByNumber(String number);
    List<Employee> locateEmployeeByHisNumber(String number);
}
