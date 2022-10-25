package dev.updooters.repos;

import dev.updooters.entities.UpdootedThread;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UpdootedThreadRepo extends JpaRepository<UpdootedThread, Integer> {

    UpdootedThread findByaccountIdAndThreadId(int accountId, int threadId);
}
