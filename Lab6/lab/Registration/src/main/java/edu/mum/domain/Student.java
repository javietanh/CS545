package edu.mum.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.time.LocalDate;

public class Student {
    private Integer id;

    @Size(min = 4, max = 50, message = "{string.size.validation}")
    @NotEmpty
    private String firstName = null;

    @NotEmpty
    @Size(min = 4, max = 50, message = "{string.size.validation}")
    private String lastName = null;

    @NotEmpty
    @Email
    private String email = null;

    @NotEmpty
    private String gender = null;

    @NotNull
    @DateTimeFormat(pattern = "MM-dd-yyyy")
    @Past
    private LocalDate birthday;

    @Valid
    private Phone phone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return String.format("First Name: %s \n" +
                        "Last Name: %s \n" +
                        "Email: %s \n" +
                        "Gender: %s \n" +
                        "Birthday: %s \n" +
                        "Phone: %s",
                firstName,
                lastName,
                email,
                gender,
                birthday,
                phone
        );
    }
}
