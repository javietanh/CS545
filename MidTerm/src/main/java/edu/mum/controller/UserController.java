package edu.mum.controller;

import edu.mum.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @ModelAttribute("roles")
    public List<String> getRoles(){
        return new ArrayList<String>() {
            {
                add("Admin");
                add("DBA");
            }
        };
    }

    @GetMapping("/user/add")
    public String getForm(@ModelAttribute("user") User user){
        return "userForm";
    }

    @PostMapping("/user/add")
    public String saveUser(@Valid User user, BindingResult result, RedirectAttributes redirectAttributes){
        // validate form submit
        if(result.hasErrors()){
            return "userForm";
        }
        redirectAttributes.addFlashAttribute("user", user);
        return "redirect:/user/userDetails";
    }

    @GetMapping("/user/userDetails")
    public String getUserDetails(){
        return "userDetails";
    }
}
