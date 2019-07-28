package edu.mum.controller;

import com.sun.deploy.net.HttpRequest;
import edu.mum.domain.Employee;
import edu.mum.service.EmployeeService;
import edu.mum.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

//    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @GetMapping("/add")
    public String getEmployeeForm(){
        return "employeeForm";
    }

//    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @PostMapping("/add")
    public String saveEmployee(Employee employee, Model model){
        model.addAttribute("emp", employee);
        employeeService.save(employee);
        return "employeeDetails";
    }

    @GetMapping("/list")
    public String getAllEmployees(Model model){
        List<Employee> employeeList = employeeService.getAll();
        model.addAttribute("employeeList", employeeList);
        return "employeeList";
    }


    @GetMapping("/lists/{fistName}")
    public String getEmployeeByName(@PathVariable String fistName, Model model){
        System.out.println("FistName: " + fistName);
        List<Employee> employeeList = employeeService.getAll();
        model.addAttribute("employeeList", employeeList);
        return "employeeList";
    }

    @GetMapping("/lists2")
    public String getEmployeeBylastName(@RequestParam(value = "lastName", required = false, defaultValue = "Tina") String last, Model model){
        System.out.println("last Name: " + last);
        List<Employee> employeeList = employeeService.getAll();
        model.addAttribute("employeeList", employeeList);
        return "employeeList";
    }

}
