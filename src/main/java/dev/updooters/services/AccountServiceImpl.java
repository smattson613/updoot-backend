package dev.updooters.services;

import dev.updooters.entities.Account;
import dev.updooters.repos.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    AccountRepo accountRepo;
    @Override
    public Account findByUsername(String username)
    {
        Optional<Account> t = accountRepo.findByUsername(username);

        if (t.isPresent())
            return t.get();

        return null;
    }
}
