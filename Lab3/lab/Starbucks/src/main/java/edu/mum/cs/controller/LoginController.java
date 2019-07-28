package edu.mum.cs.controller;

import edu.mum.cs.domain.Login;
import edu.mum.cs.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    private LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping("/")
    public String view(){
        return "login";
    }

    @PostMapping(value = "/login")
    public String login(Model model, Login login, HttpServletRequest request) {
        Boolean result = loginService.authenticate(login);
        if (result == true) {
            request.getSession().setAttribute("isAuthenticated", true);
            return "advice";
        } else {
            model.addAttribute("errors", "Name or Password is invalid.");
            return "login";
        }
    }
}
