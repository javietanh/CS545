package edu.mum.lab11.service;

import edu.mum.lab11.domain.Employee;
import edu.mum.lab11.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getEmployees() {
        return (List<Employee>) employeeRepository.findAll();
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getEmployeeByNumber(String number) {
        return employeeRepository.getEmployeeByNumber(number);
    }

    @Override
    public List<Employee> locateEmployeeByHisNumber(String number) {
        return employeeRepository.locateEmployeeByHisNumber(number);
    }
}
