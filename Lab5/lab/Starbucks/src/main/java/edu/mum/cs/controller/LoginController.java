package edu.mum.cs.controller;

import edu.mum.cs.domain.Login;
import edu.mum.cs.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes({"login"})
public class LoginController {

    private LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping(value = {"/", "/login"})
    public String view() {
        return "login";
    }

    @PostMapping(value = "/login")
    public String login(Model model, Login login) {
        Boolean result = loginService.authenticate(login);
        if (result == true) {
            model.addAttribute("login", login);
            return "redirect:/advice";
        } else {
            model.addAttribute("errors", "Name or Password is invalid.");
            return "login";
        }
    }
}
