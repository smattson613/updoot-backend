package dev.updooters.entities;

import javax.persistence.*;

@Entity
@Table(name = "reply")
public class Reply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reply_id")
    private int replyId;

    @Column(name = "thread_id")
    private int threadId;

    @Column(name = "account_id")
    private int accountId;

    @Column(name = "content")
    private String content;

    @Column(name = "epoch")
    private long epoch;

    @Column(name = "updoot")
    private int updoot;

    public Reply() {
    }

    public Reply(int replyId, int threadId, int accountId, String content, long epoch, int updoot) {
        this.replyId = replyId;
        this.threadId = threadId;
        this.accountId = accountId;
        this.content = content;
        this.epoch = epoch;
        this.updoot = updoot;
    }

    public long getEpoch() {
        return epoch;
    }

    public void setEpoch(long epoch) {
        this.epoch = epoch;
    }

    public int getReplyId() {
        return replyId;
    }

    public void setReplyId(int replyId) {
        this.replyId = replyId;
    }

    public int getThreadId() {
        return threadId;
    }

    public void setThreadId(int threadId) {
        this.threadId = threadId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getUpdoot() {
        return updoot;
    }

    public void setUpdoot(int updoot) {
        this.updoot = updoot;
    }

    @Override
    public String toString() {
        return "Reply{" +
                "replyId=" + replyId +
                ", threadId=" + threadId +
                ", accountId=" + accountId +
                ", content='" + content + '\'' +
                ", updoot=" + updoot +
                '}';
    }
}
