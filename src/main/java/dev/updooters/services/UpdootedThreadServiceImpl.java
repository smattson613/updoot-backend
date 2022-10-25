package dev.updooters.services;

import dev.updooters.entities.UpdootedThread;
import dev.updooters.repos.UpdootedThreadRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdootedThreadServiceImpl implements UpdootedThreadService{

    @Autowired
    UpdootedThreadRepo updootedThreadRepo;

    @Override
    public UpdootedThread postUpdootedThread(UpdootedThread updootedThread) {
        return this.updootedThreadRepo.save(updootedThread);
    }

    @Override
    public void removeUpdootedThread(int utId) {
        this.updootedThreadRepo.deleteById(utId);
    }

    @Override
    public boolean getUpdootedThread(int accountId, int threadId) {
        return this.updootedThreadRepo.findByaccountIdAndThreadId(accountId, threadId) != null;
    }
}
