package dev.updooters.updoot;

import dev.updooters.entities.Account;
import dev.updooters.repos.AccountRepo;
import dev.updooters.services.AccountService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
public class AccountServiceTests {

    @Autowired
    AccountService accountService;

    @Autowired
    AccountRepo accountRepo;

    @Test
    void get_user_by_username()
    {
        accountRepo.save(new Account(0, "getUserByUsernameTest", "pass"));
       Account t = accountService.findByUsername("getUserByUsernameTest");

        Assertions.assertEquals("getUserByUsernameTest", t.getUsername());
        Assertions.assertNotEquals(0, t.getAccountId());
    }
}
