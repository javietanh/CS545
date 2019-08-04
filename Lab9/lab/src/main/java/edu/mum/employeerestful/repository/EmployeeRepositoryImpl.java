package edu.mum.employeerestful.repository;

import edu.mum.employeerestful.domain.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeRepositoryImpl implements EmployeeRepository {
    private List<Employee> employees = new ArrayList<>();

    @Override
    public List<Employee> getEmployees() {
        employees.add(new Employee("Viet Anh", "Nguyen", "vi.nguyen@mum.edu"));
        employees.add(new Employee("John", "Doo", "john@gmail.com"));
        return employees;
    }

    @Override
    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }
}
