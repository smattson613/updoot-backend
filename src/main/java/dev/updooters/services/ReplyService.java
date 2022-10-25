package dev.updooters.services;

import dev.updooters.entities.Reply;

import java.util.List;

public interface ReplyService {

    Reply postReply(Reply reply);

    List<Reply> getAllReplies();

    List<Reply> getAllRepliesByPostId(int postId);

    int updootReply(int replyId);
}
