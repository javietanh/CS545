package edu.mum.cs.controller;

import edu.mum.cs.domain.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping("/session")
@SessionAttributes({"product", "university"})
public class SessionController {

    @GetMapping("/")
    public String setSessionAttribute(Model model, HttpSession session){
        model.addAttribute("university", "Argiro");
        model.addAttribute("product", new Product(1L, "iphone", 100.00));
        model.addAttribute("courseName", "CS545");

        displaySessionHelper(model, session);

        System.out.println("=======Before HttpSession=================");
        session.setAttribute("university", "MUM");
        session.setAttribute("professorName", "Tina");

        displaySessionHelper(model, session);
        System.out.println("=============After HttpSession================");
        return "redirect:/session/displaySession";
    }

    @GetMapping("/displaySession")
    public String displaySessionAttributes(Model model, HttpSession session, SessionStatus status){
        System.out.println("***********inside redirect method****************");
        displaySessionHelper(model, session);
        status.setComplete();
        return "sessionscope";
    }


    private void displaySessionHelper(Model model, HttpSession session){
        Map map = model.asMap();
        System.out.println(map.get("university"));
        System.out.println((Product)map.get("product"));

        System.out.println("-------------------------");

        System.out.println(session.getAttribute("university"));
        System.out.println((Product)session.getAttribute("product"));
        System.out.println(session.getAttribute("professorName"));
    }

}
