package edu.mum.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.time.LocalDate;

public class User {
    @Size(min=2, max=30, message = "{name.size.validator}")
    @NotEmpty
    private String name;

    @NotBlank
    @Email
    private String email;

    @NotNull
    @Min(18)
    private Integer age;

    @NotNull
    @DateTimeFormat(pattern = "MM/dd/yyyy")
    private LocalDate birthday;

    @NotEmpty
    private String role;

    @Valid
    private Address addr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }
}
