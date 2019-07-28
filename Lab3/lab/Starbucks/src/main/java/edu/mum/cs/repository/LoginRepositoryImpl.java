package edu.mum.cs.repository;

import edu.mum.cs.data.Database;
import org.springframework.stereotype.Service;

@Service
public class LoginRepositoryImpl implements LoginRepository {

    @Override
    public Boolean validateLogin(String name, String password) {
        String findUser = Database.getPassword(name);
        return findUser.equals(password);
    }
}
