package dev.updooters.services;

import dev.updooters.entities.Account;
import dev.updooters.exceptions.InvalidUsernameException;
import dev.updooters.exceptions.PasswordMismatchException;
import dev.updooters.repos.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    AccountRepo accountRepo;

    @Override
    public Optional<Account> validateUser(String username, String password) {
        Optional<Account> account =  accountRepo.findByUsername(username);

        if(!account.isPresent()) {
            throw new InvalidUsernameException();
        } if(!account.get().getPassword().equals(password)) {
            throw new PasswordMismatchException();
        }
        account.get().setPassword("");

        return account;
    }
}



