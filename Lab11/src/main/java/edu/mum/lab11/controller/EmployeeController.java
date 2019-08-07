package edu.mum.lab11.controller;

import edu.mum.lab11.domain.Employee;
import edu.mum.lab11.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

    EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(value = {"/add"})
    public String getEmployeeForm(@ModelAttribute("employee") Employee employee) {
        return "employeeForm";
    }

    @PostMapping(value = {"/add"})
    public String addEmployee(@Valid Employee employee, BindingResult result) {
        if (result.hasErrors()) {
            return "employeeForm";
        }
        employeeService.addEmployee(employee);
        return "redirect:/list";
    }

    @GetMapping(value = {"/list"})
    public String getEmployeeList(Model model,
                                  @RequestParam(value = "number", required = false) String number,
                                  @RequestParam(value = "locate", required = false) String locate) {
        if (number != null) {
            model.addAttribute("employees", employeeService.getEmployeeByNumber(number));
        } else if (locate != null) {
            model.addAttribute("employees", employeeService.locateEmployeeByHisNumber(locate));
        } else {
            model.addAttribute("employees", employeeService.getEmployees());
        }

        return "employeeList";
    }
}
