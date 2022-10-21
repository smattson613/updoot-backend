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
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
public class ThreadServiceTests {

    @Autowired
    AccountRepo accountRepo;

    @Autowired
    ThreadRepo threadRepo;

    @Autowired
    ThreadService threadService;

    @Test
    void get_just_users_threads()
    {
        //setup
        Account user = accountRepo.save(new Account(0, "testUser", "password"));
        Account fillerUser = accountRepo.save(new Account(0, "anotherUser", "password"));

        threadRepo.save(new Thread(0, user.getAccountId(), "First Post","Trash", 0,0));
        threadRepo.save(new Thread(0, user.getAccountId(), "Second Post","Trash", 0,0));
        threadRepo.save(new Thread(0, user.getAccountId(), "Third Post","Trash", 0,0));
        threadRepo.save(new Thread(0, user.getAccountId(), "Fourth Post","Trash", 0,0));

        threadRepo.save((new Thread(0, fillerUser.getAccountId(), "First Post", "more trash", 0, 0)));
        threadRepo.save((new Thread(0, fillerUser.getAccountId(), "Second Post", "more trash", 0, 0)));
        threadRepo.save((new Thread(0, fillerUser.getAccountId(), "Third Post", "more trash", 0, 0)));

        // test
        Assertions.assertEquals(4, threadService.getAllUserThreads("testUser").size());
    }
}
