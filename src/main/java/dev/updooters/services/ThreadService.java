package dev.updooters.services;

import dev.updooters.entities.Thread;
import java.util.List;

public interface ThreadService {

    Thread createThread(Thread thread);
    
    List<Thread> getAllThreads();

    List<Thread> getAllUserThreads(String username);

    int updootThread(int threadId);

    Thread getThreadById(int id);

}
