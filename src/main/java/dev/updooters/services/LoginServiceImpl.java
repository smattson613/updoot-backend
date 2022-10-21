package dev.updooters.services;

import dev.updooters.entities.Account;
import dev.updooters.repos.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginServiceImpl implements LoginService {



    @Autowired
    AccountRepo accountRepo;

    @Override
    public Account validateUser(String username, String password) {
        Account account =  accountRepo.findByUsername(username);
        return account;
    }
    }



