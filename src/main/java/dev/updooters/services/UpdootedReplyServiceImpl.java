package dev.updooters.services;

import dev.updooters.entities.UpdootedReply;
import dev.updooters.repos.UpdootedReplyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdootedReplyServiceImpl implements UpdootedReplyService{

    @Autowired
    UpdootedReplyRepo updootedReplyRepo;

    @Override
    public UpdootedReply postUpdootedReply(UpdootedReply updootedReply) {
        return this.updootedReplyRepo.save(updootedReply);
    }

    @Override
    public void removeUpdootedReply(int urId) {
        this.updootedReplyRepo.deleteById(urId);
    }

    @Override
    public boolean getUpdootedReply(int accountId, int replyId) {
        return this.updootedReplyRepo.findByaccountIdAndReplyId(accountId, replyId) != null;
    }
}
