package edu.mum.cs.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class User {

    private String username;
    private String password;
    private String email;

    private LocalDateTime createdTime;
}
