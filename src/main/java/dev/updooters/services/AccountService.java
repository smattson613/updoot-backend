package dev.updooters.services;

import dev.updooters.entities.Account;

public interface AccountService {

    Account findByUsername(String username);
}
