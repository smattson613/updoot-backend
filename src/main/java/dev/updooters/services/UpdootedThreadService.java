package dev.updooters.services;

import dev.updooters.entities.UpdootedThread;

public interface UpdootedThreadService {

    UpdootedThread postUpdootedThread(UpdootedThread updootedThread);

    void removeUpdootedThread(int utId);

    boolean getUpdootedThread(int accountId, int threadId);
}
