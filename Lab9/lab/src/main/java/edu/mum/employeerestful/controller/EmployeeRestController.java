package edu.mum.employeerestful.controller;

import edu.mum.employeerestful.domain.Employee;
import edu.mum.employeerestful.service.EmployeeService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import javax.validation.Valid;
import java.awt.*;
import java.util.List;

@RestController
public class EmployeeRestController {

    private EmployeeService employeeService;

    public EmployeeRestController(EmployeeService employeeService) {

        this.employeeService = employeeService;
    }

    @GetMapping(value = {"/Employee"}, produces = "application/json")
    public @ResponseBody
    List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }


    @PostMapping(value = {"/Employee"},
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Employee saveEmployee(@Valid @RequestBody Employee employee) {
        System.out.printf(employee.getFirstName());
        this.employeeService.addEmployee(employee);
        return employee;
    }
}
