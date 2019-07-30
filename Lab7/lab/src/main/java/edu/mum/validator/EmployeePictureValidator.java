package edu.mum.validator;

import edu.mum.domain.Employee;
import edu.mum.domain.Picture;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class EmployeePictureValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Employee.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Employee employee = (Employee) target;
        if(employee == null || employee.getPicture().getContent() == null || employee.getPicture().getContent().isEmpty()){
            errors.rejectValue("picture", "emp.picture.required");
        }
    }
}
