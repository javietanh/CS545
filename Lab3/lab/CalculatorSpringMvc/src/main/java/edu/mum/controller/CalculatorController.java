package edu.mum.controller;

import edu.mum.domain.Calculator;
import edu.mum.validator.CalculatorValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CalculatorController {

    private CalculatorValidator calculatorValidator;

    @Autowired
    public CalculatorController(CalculatorValidator calculatorValidator){
        this.calculatorValidator = calculatorValidator;
    }

    @GetMapping("/")
    public String Get(Calculator calculator, Model model){
        model.addAttribute("cal", calculator);
        return "calculator";
    }

    @PostMapping("/compute")
    public String post(Calculator calculator, Model model){
        List<String> errors = calculatorValidator.validate(calculator);
        if(errors.isEmpty()){
            calculator.compute();
            model.addAttribute("cal", calculator);
        }else{
            model.addAttribute("errors", errors);
            model.addAttribute("cal", calculator);
        }
        return "calculator";
    }
}
