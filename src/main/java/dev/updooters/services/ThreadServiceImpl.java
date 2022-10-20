package dev.updooters.services;

import dev.updooters.entities.Account;
import dev.updooters.entities.Thread;
import dev.updooters.repos.ThreadRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ThreadServiceImpl implements ThreadService{
    @Autowired
    ThreadRepo threadRepo;

    @Autowired
    AccountService accountService;

    public List<Thread> getAllThreads(){
        return threadRepo.findAll();
    }

    @Override
    public List<Thread> getAllUserThreads(String username)
    {
        Account t = accountService.findByUsername(username);

        if (t != null)
            return getAllThreads().stream().filter(thread -> thread.getAccountId() == t.getAccountId()).collect(Collectors.toList());

        return null;
    }
}
