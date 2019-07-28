package edu.mum.controller;

import edu.mum.domain.Calculator;
import edu.mum.validator.CalculatorValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CalculatorController {

    private CalculatorValidator calculatorValidator;

    @Autowired
    public CalculatorController(CalculatorValidator calculatorValidator){
        this.calculatorValidator = calculatorValidator;
    }

    @GetMapping("/")
    public String GetForm(Model model){
        model.addAttribute("cal", new Calculator());
        return "form";
    }

    @RequestMapping(value = "/compute", method = RequestMethod.POST)
    public String compute(Calculator calculator, Model model, RedirectAttributes redirectAttributes){
        List<String> errors = calculatorValidator.validate(calculator);
        if(errors.isEmpty()){
            calculator.compute();
            redirectAttributes.addFlashAttribute("cal", calculator);
            return "redirect:/getResult";
        }else{
            model.addAttribute("errors", errors);
            model.addAttribute("cal", calculator);
            return "form";
        }
    }

    @GetMapping("/getResult")
    public String result(){
        return "result";
    }

}
