package dev.updooters.updoot;

import dev.updooters.entities.Account;
import dev.updooters.entities.Reply;
import dev.updooters.entities.Thread;
import dev.updooters.repos.AccountRepo;
import dev.updooters.repos.ReplyRepo;
import dev.updooters.repos.ThreadRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
public class ReplyRepoTests {

    @Autowired
    AccountRepo accountRepo;

    @Autowired
    ThreadRepo threadRepo;

    @Autowired
    ReplyRepo replyRepo;

    @Test
    void comment_on_a_post(){
        Account testAccount = new Account(0, "username", "password");
        this.accountRepo.save(testAccount);
        Thread testThread = new Thread(0, testAccount.getAccountId(), "title", "content", 100000000l, 0);
        this.threadRepo.save(testThread);
        Reply testReply = new Reply(0, testThread.getThreadId(), testAccount.getAccountId(), "test comment", 100000000l, 0);
        this.replyRepo.save(testReply);
        Assertions.assertNotEquals(0, testReply.getReplyId());
    }
}
