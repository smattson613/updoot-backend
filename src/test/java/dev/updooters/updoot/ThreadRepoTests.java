package dev.updooters.updoot;

import dev.updooters.entities.Account;
import dev.updooters.entities.Thread;
import dev.updooters.repos.AccountRepo;
import dev.updooters.repos.ThreadRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
public class ThreadRepoTests {
    @Autowired
    ThreadRepo threadRepo;

    @Autowired
    AccountRepo accountRepo;

    @Test
    void create_post()
    {
        Account account = new Account(0, "Username", "Password");
        Account savedAccount = accountRepo.save(account);

        Thread thread = new Thread(0, savedAccount.getAccountId(), "Title", "I am a sentence", 0);
        Thread savedThread = threadRepo.save(thread);

        Assertions.assertNotEquals(0, savedThread.getThreadId());
    }
}
