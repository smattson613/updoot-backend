package dev.updooters.services;

import dev.updooters.entities.Reply;
import dev.updooters.repos.ReplyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReplyServiceImpl implements ReplyService{

    @Autowired
    ReplyRepo replyRepo;
    @Override
    public Reply postReply(Reply reply) {
        return this.replyRepo.save(reply);
    }

    @Override
    public List<Reply> getAllReplies() {
        return this.replyRepo.findAll();
    }

    @Override
    public List<Reply> getAllRepliesByPostId(int postId) {
        return this.replyRepo.findBythreadId(postId);
    }
}
