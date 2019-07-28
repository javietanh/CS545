package edu.mum.controller;

import edu.mum.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Random;

@Controller
public class StudentController {

    @GetMapping(value = "/registration")
    public String showForm(@ModelAttribute("student") Student student) {
        return "registration";
    }

    @PostMapping(value = "/registration")
    public String registration(@ModelAttribute("student") @Validated Student student,
                               BindingResult bindingResult,
                               RedirectAttributes redirectAttributes,
                               Model model) {
        if(bindingResult.hasErrors()){
            return "registration";
        }
        Integer newId = new Random().nextInt();
        student.setId(newId);
        redirectAttributes.addFlashAttribute("student", student);
        return "redirect:/success";
    }

    @GetMapping("/success")
    public String success(@ModelAttribute("student") Student student){
        System.out.println(student);
        return "success";
    }

}
