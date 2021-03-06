package edu.mum.validator;

import edu.mum.domain.Calculator;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CalculatorValidatorImpl implements CalculatorValidator {
    public List<String> validate(Object object) {
        // keep errors in the list.
        List<String> errors = new ArrayList<String>();

        // parse the calculator object.
        Calculator calculator = (Calculator) object;

        // validate the left operand of plus method.
        Double add1 = calculator.getAdd1();
        if (add1 == null) {
            errors.add("Plus method: Left operand must be a number.");
        }

        // validate the right operand of plus method.
        Double add2 = calculator.getAdd2();
        if (add2 == null) {
            errors.add("Plus method: Right operand must be a number.");
        }

        // validate the left operand of multi method.
        Double mult1 = calculator.getMult1();
        if (mult1 == null) {
            errors.add("Multiply method: Left operand must be a number.");
        }

        // validate the right operand of plus method.
        Double mult2 = calculator.getMult2();
        if (mult2 == null) {
            errors.add("Multiply method: Right operand must be a number.");
        }

        // return validation errors.
        return errors;
    }
}
