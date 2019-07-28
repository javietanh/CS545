package edu.mum.cs.validator;

import java.util.List;

public interface Validator {
    List<String> validate(Object object);
}
