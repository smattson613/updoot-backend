package dev.updooters.services;

import dev.updooters.entities.Account;

import java.util.Optional;

public interface LoginService {

    Optional<Account> validateUser(String username, String password);
}
