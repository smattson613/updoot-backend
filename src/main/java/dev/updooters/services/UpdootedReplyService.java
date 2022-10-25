package dev.updooters.services;

import dev.updooters.entities.UpdootedReply;

public interface UpdootedReplyService {

    UpdootedReply postUpdootedReply(UpdootedReply updootedReply);

    void removeUpdootedReply(int urId);

    boolean getUpdootedReply(int accountId, int replyId);
}
