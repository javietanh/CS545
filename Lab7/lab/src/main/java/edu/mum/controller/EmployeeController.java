package edu.mum.controller;

import edu.mum.domain.Employee;
import edu.mum.domain.Picture;
import edu.mum.validator.EmployeePictureValidator;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;
import java.util.Random;

@Controller
public class EmployeeController {

    private static final Log logger = LogFactory.getLog(EmployeeController.class);

    @RequestMapping(value = {"/", "employee_input"})
    public String inputEmployee(@ModelAttribute("employee") Employee employee) {
        return "EmployeeForm";
    }

    @RequestMapping(value = "/employee_save")
    public String saveEmployee(@Valid Employee emp, BindingResult bindingResult,
                               Model model, HttpServletRequest request, RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {
            return "EmployeeForm";
        }

        String[] suppressedFields = bindingResult.getSuppressedFields();
        if (suppressedFields.length > 0) {
            throw new RuntimeException("Attempt to bind fields that haven't been allowed in initBinder(): "
                    + StringUtils.addStringToArray(suppressedFields, ", "));
        }

        //emp.setId(new Random().nextLong());

        // save upload file
        MultipartFile employeePicture = emp.getPicture().getContent();
        String rootDirectory = request.getSession().getServletContext().getRealPath("/");
        String pictureUrl = rootDirectory + "resources\\images\\"+ emp.getId() +".png";

        if (employeePicture != null && !employeePicture.isEmpty()) {
            try {
                employeePicture.transferTo(new File(pictureUrl));
                emp.getPicture().setUrl(pictureUrl);
            } catch (Exception ex) {
                throw new RuntimeException("Employee image saving failed", ex);
            }
        }

        // save product here
        redirectAttributes.addFlashAttribute("employee", emp);

        return "redirect:/success";
    }

    @GetMapping("/success")
    public String success(){
        return "EmployeeDetails";
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
//         binder.setDisallowedFields(new String[]{"firstName"});
        //binder.setValidator(new EmployeePictureValidator());
    }
}
