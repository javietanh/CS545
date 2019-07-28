package edu.mum.cs.repository;

import edu.mum.cs.domain.Login;

public interface LoginRepository {
    Boolean validateLogin(String name, String password);
}
