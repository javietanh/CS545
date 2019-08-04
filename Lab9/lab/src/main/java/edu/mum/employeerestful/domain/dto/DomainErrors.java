package edu.mum.employeerestful.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DomainErrors {
    private String errorType;
    private List<DomainError> errorFields = new ArrayList<>();

    public void addError(String path, String message) {
        DomainError error = new DomainError(path, message);
        this.errorFields.add(error);
    }
}
	
 
