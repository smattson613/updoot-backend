package dev.updooters.controllers;

import dev.updooters.dtos.LoginCredentials;
import dev.updooters.entities.Account;
import dev.updooters.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@CrossOrigin
public class AccountController {
    @Autowired
    LoginService loginService;
    @PostMapping("/login")
    public Optional<Account> login(@RequestBody LoginCredentials loginCredentials) {
        Optional<Account> login = loginService.validateUser(loginCredentials.getUsername(), loginCredentials.getPassword());
        return login;

    }
}
