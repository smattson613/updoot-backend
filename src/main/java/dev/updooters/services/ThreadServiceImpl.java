package dev.updooters.services;

import dev.updooters.entities.Thread;
import dev.updooters.repos.ThreadRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThreadServiceImpl implements ThreadService{
    @Autowired
    ThreadRepo threadRepo;

    public List<Thread> getAllThreads(){
        return threadRepo.findAll();
    }
}
