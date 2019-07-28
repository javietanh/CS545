package edu.mum.cs.controller;

import edu.mum.cs.domain.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/request")
public class RequestScopeController {

    @GetMapping("/")
    public String setRequestAttribute(Model model, HttpServletRequest request){
        model.addAttribute("product", new Product(1L, "iphone", 100.00));
        model.addAttribute("courseName", "CS545");
        request.setAttribute("university", "MUM");
        model.addAttribute("Tina");
        model.addAttribute(1234);
        model.addAttribute(9999);
        return "redirect:/getRequestAttributes";
    }

    @GetMapping("/getRequestAttributes")
    public String displayRequestAttributes(Model model,@RequestParam(required = false) String courseName){
        model.addAttribute("courseName", courseName);
        return "requestscope";
    }

}
