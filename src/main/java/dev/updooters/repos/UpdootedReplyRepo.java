package dev.updooters.repos;

import dev.updooters.entities.UpdootedReply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UpdootedReplyRepo extends JpaRepository<UpdootedReply, Integer> {

    UpdootedReply findByaccountIdAndReplyId(int accountId, int replyId);
}
