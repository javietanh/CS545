package edu.mum.service;

import edu.mum.domain.Employee;

import java.util.List;

public interface EmployeeService {

    void save(Employee employee);

    List<Employee> getAll();
}
