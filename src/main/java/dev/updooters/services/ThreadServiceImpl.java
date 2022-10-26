package dev.updooters.services;

import dev.updooters.entities.Reply;
import dev.updooters.entities.Thread;
import dev.updooters.exceptions.ContentEmptyException;
import dev.updooters.entities.Account;
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
  
      @Override
    public Thread createThread(Thread thread) {
        if(thread.getTitle().equals("")) {
            throw new ContentEmptyException();
        }
        if(thread.getContent().equals("")){
            throw new ContentEmptyException();
        }

        return threadRepo.save(thread);
}
    @Override
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

    @Override
    public int updootThread(int threadId) {
        Thread thread = this.threadRepo.findById(threadId).get();
        thread.setUpdoot(thread.getUpdoot() + 1);
        this.threadRepo.save(thread);
        return thread.getUpdoot();
    }
}
