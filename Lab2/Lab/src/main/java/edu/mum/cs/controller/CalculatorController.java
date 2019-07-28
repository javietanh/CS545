package edu.mum.cs.controller;

import edu.mum.cs.domain.Calculator;
import edu.mum.cs.validator.CalculatorValidator;
import mum.edu.framework.annotation.AutoWired;
import mum.edu.framework.annotation.Controller;
import mum.edu.framework.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Servlet implementation class Calculator
 */
@Controller
public class CalculatorController {

    @AutoWired
    CalculatorValidator calculatorValidator;

    @RequestMapping(value = {"/", "/calculator_input"})
    public String calculatorInput(HttpServletRequest request, HttpServletResponse response){
        return "/WEB-INF/jsp/calculator.jsp";
    }

    @RequestMapping(value = "/calculator_compute")
    public String compute(Calculator calculator, HttpServletRequest request) {
        List<String> errors = calculatorValidator.validate(calculator);
        if (errors.isEmpty()) {
            // compute result.
            calculator.setSum(calculator.getAdd1() + calculator.getAdd2());
            calculator.setProduct(calculator.getMult1() * calculator.getMult2());
            // dispatch result.
            request.setAttribute("calculator", calculator);
        } else {
            request.setAttribute("errors", errors);
            request.setAttribute("calculator", calculator);
        }
        return "/WEB-INF/jsp/calculator.jsp";
    }
}
