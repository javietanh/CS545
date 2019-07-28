package edu.mum.cs.service;

import edu.mum.cs.domain.Login;

public interface LoginService {
    Boolean authenticate(Login login);
}
