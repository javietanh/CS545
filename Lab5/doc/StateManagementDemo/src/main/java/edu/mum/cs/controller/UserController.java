package edu.mum.cs.controller;

import edu.mum.cs.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDateTime;

@Controller
//@SessionAttributes({"savedUser"})
public class UserController {

    @GetMapping("/")
    public String getSignupForm(@ModelAttribute User user) {
        return "signup";
    }

    @PostMapping("/")
    public String saveUser(User user, Model model, RedirectAttributes redirectAttributes) {
        //save to DB
        user.setCreatedTime(LocalDateTime.now());
//        model.addAttribute("savedUser", user);
        redirectAttributes.addFlashAttribute("savedUser", user);
//        redirectAttributes.addFlashAttribute(user);
        model.addAttribute("name", "Joshua");
        redirectAttributes.addAttribute("age", 11);
        return "redirect:/getDetail";
    }

    @GetMapping("/getDetail")
    public String displayDetail(SessionStatus status){
//        status.setComplete();
        return "userdetail";
    }
}
