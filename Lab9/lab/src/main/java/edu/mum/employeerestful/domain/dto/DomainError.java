package edu.mum.employeerestful.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DomainError {
    private String field;
    private String message;
}
	
 
