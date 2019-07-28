package edu.mum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

    @RequestMapping("/")
    public String getEmployeeForm(){
        return "employeeForm";
    }
}
