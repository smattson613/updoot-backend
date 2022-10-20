package dev.updooters.repos;

import dev.updooters.entities.Reply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReplyRepo extends JpaRepository<Reply, Integer> {

    List<Reply> findBythreadId(int threadId);
}
