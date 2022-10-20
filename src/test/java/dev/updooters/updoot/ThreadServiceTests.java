package dev.updooters.updoot;

import dev.updooters.entities.Account;
import dev.updooters.entities.Thread;
import dev.updooters.repos.AccountRepo;
import dev.updooters.repos.ThreadRepo;
import dev.updooters.services.ThreadService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ThreadServiceTests {

    @Autowired
    ThreadService threadService;

    @Autowired
    AccountRepo accountRepo;

    @Test
    void create_post()
    {
        Account account = new Account(0, "Username", "Password");
        Account savedAccount = accountRepo.save(account);

        Thread thread = new Thread(0, savedAccount.getAccountId(), "Title", "I am a sentence", 0);
        Thread savedThread = threadService.createThread(thread);

        Assertions.assertNotEquals(0, savedThread.getThreadId());
    }

}
