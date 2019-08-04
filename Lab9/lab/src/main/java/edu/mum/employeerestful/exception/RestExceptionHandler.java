package edu.mum.employeerestful.exception;

import edu.mum.employeerestful.domain.dto.DomainErrors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;
import java.util.Locale;

@ControllerAdvice
public class RestExceptionHandler {

    @Autowired
    private MessageSource messageSource;

    @Autowired
    private MessageSourceAccessor messageSourceAccessor;

    @ExceptionHandler({MethodArgumentNotValidException.class})
    @ResponseBody()
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public DomainErrors processRestExceptions(MethodArgumentNotValidException ex){
        BindingResult result = ex.getBindingResult();
        List<FieldError> errors = result.getFieldErrors();
        return processFieldErrors(errors);
    }

    private DomainErrors processFieldErrors(List<FieldError> errors){
        DomainErrors domainErrors = new DomainErrors();
        domainErrors.setErrorType("ValidationError");
        for(FieldError field : errors){
            domainErrors.addError(field.getField(), messageSourceAccessor.getMessage(field));
        }
        return domainErrors;
    }

    private String resolveLocalizedErrorMessage(FieldError fieldError){
        Locale locale = LocaleContextHolder.getLocale();
        String localizedErrorMessage = messageSource.getMessage(fieldError, locale);

        if(localizedErrorMessage.equals(fieldError.getDefaultMessage())){
            String[] fieldErrorsCodes = fieldError.getCodes();
            localizedErrorMessage = fieldErrorsCodes[0];
        }
        return localizedErrorMessage;
    }

}
