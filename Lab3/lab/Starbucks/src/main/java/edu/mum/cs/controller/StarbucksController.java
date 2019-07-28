package edu.mum.cs.controller;

import edu.mum.cs.domain.Roast;
import edu.mum.cs.service.StarbucksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StarbucksController {

    private StarbucksService starbucksService;

    @Autowired
    public StarbucksController(StarbucksService starbucksService){
        this.starbucksService = starbucksService;
    }

    @PostMapping("/advice")
    public String advice(Model model, Roast roast){
        model.addAttribute("advices",
                this.starbucksService.getAdvice(roast.getRoast()));
        model.addAttribute("roast", roast);
        return "advice";
    }
}
