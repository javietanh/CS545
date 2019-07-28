package edu.mum.cs.service.impl;

import edu.mum.cs.domain.Login;
import edu.mum.cs.repository.LoginRepository;
import edu.mum.cs.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    private LoginRepository loginRepository;

    @Autowired
    public LoginServiceImpl(LoginRepository loginRepository) {

        this.loginRepository = loginRepository;
    }

    @Override
    public Boolean authenticate(Login login) {
        return loginRepository.validateLogin(login.getName(),
                login.getPassword());
    }
}
