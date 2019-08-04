package edu.mum.employeerestful.repository;

import edu.mum.employeerestful.domain.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> getEmployees();
    void addEmployee(Employee employee);
}
