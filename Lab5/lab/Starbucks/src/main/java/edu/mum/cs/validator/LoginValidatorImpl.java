package edu.mum.cs.validator;

import edu.mum.cs.domain.Login;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoginValidatorImpl implements Validator {
    @Override
    public List<String> validate(Object object) {
        List<String> errors = new ArrayList<String>();

        Login login = (Login) object;

        if(login.getName() == ""){
            errors.add("Name is required.");
        }

        if(login.getPassword() == ""){
            errors.add("Password is required.");
        }

        return errors;

    }
}
