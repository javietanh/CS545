package edu.mum.employeerestful.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee  {

	@NotBlank
 	private String firstName;

	@NotBlank
	@Size(min=3, max = 10)
 	private String lastName;

	@NotBlank
 	private String email;

}
