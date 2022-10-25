package dev.updooters.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "updooted_reply")
public class UpdootedReply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ur_id")
    private int urId;

    @Column(name = "account_id")
    private int accountId;

    @Column(name = "reply_id")
    private int replyId;

    public int getUrId() {
        return this.urId;
    }

    public int getAccountId() {
        return this.accountId;
    }

    public int getReplyId() {
        return this.replyId;
    }

    public void setUrId(int urId) {
        this.urId = urId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public void setReplyId(int replyId) {
        this.replyId = replyId;
    }

    @Override
    public String toString() {
        return "UpdootedReply{" +
                "urId=" + urId +
                ", accountId=" + accountId +
                ", replyId=" + replyId +
                '}';
    }
}
