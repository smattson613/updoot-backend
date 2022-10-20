package dev.updooters.services;

import dev.updooters.entities.Thread;
import dev.updooters.exceptions.ContentEmptyException;
import dev.updooters.repos.ThreadRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThreadServiceImpl implements ThreadService{

    @Autowired
    ThreadRepo threadRepo;

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
}
