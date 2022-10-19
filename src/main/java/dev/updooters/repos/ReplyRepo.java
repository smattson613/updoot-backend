package dev.updooters.repos;

import dev.updooters.entities.Reply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReplyRepo extends JpaRepository<Reply, Integer> {
}
