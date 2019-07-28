package edu.mum.cs.controller;

import edu.mum.cs.domain.Login;
import edu.mum.cs.domain.Roast;
import edu.mum.cs.service.StarbucksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes({"login"})
public class StarbucksController {

    private StarbucksService starbucksService;

    @Autowired
    public StarbucksController(StarbucksService starbucksService){
        this.starbucksService = starbucksService;
    }

    @RequestMapping(value = {"/advice"}, method = RequestMethod.GET)
    public String view(){
        return "advice";
    }

    @PostMapping("/advice")
    public String advice(Model model, Roast roast){

        // checking if the user session is not exist
        // redirect the user to login view
        Login login = (Login) model.asMap().get("login");
        if(login == null){
            return "redirect:/login";
        }

        model.addAttribute("advices",
                this.starbucksService.getAdvice(roast.getRoast()));
        model.addAttribute("roast", roast);
        model.addAttribute("login", login);

        return "advice";
    }

    @PostMapping(value = {"/logout"})
    public String logout(SessionStatus sessionStatus){
        sessionStatus.setComplete();
        return "redirect:/login";
    }
}
