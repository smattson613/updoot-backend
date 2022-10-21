package dev.updooters.services;

import dev.updooters.entities.Account;

public interface LoginService {

    Account validateUser(String username, String password);
}
