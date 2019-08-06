package edu.mum.lab10.controller;

import edu.mum.lab10.domain.Employee;
import edu.mum.lab10.repository.EmployeeRepository;
import edu.mum.lab10.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
public class EmployeeController {

    EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/")
    public String getEmployeeForm(@ModelAttribute("employee") Employee employee) {
        return "employeeForm";
    }

    @PostMapping("/")
    public String addEmployee(@Valid Employee employee, BindingResult result){
        if(result.hasErrors()){
            return "employeeForm";
        }
        employeeService.addEmployee(employee);
        return "redirect:/employeeList";
    }

    @GetMapping("/employeeList")
    public String getEmployeeList(Model model,
                                  @RequestParam(value = "number", required = false) String number,
                                  @RequestParam(value = "locate", required = false) String locate){
        if(number != null){
            model.addAttribute("employees", employeeService.getEmployeeByNumber(number));
        }else if(locate != null){
            model.addAttribute("employees", employeeService.locateEmployeeByHisNumber(locate));
        }else{
            model.addAttribute("employees", employeeService.getEmployees());
        }

        return "employeeList";
    }
}
