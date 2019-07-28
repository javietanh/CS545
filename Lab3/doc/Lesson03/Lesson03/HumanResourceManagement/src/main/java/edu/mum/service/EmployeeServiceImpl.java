package edu.mum.service;

import edu.mum.domain.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private List<Employee> employees = new ArrayList<Employee>();

    public void save(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getAll() {
        return employees;
    }
}
