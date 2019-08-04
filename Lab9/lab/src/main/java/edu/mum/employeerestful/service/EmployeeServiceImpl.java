package edu.mum.employeerestful.service;

import edu.mum.employeerestful.domain.Employee;
import edu.mum.employeerestful.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository){

        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.getEmployees();
    }

    @Override
    public void addEmployee(Employee employee) {
        this.employeeRepository.addEmployee(employee);
    }
}
