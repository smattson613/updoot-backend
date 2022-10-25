package dev.updooters.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "updooted_thread")
public class UpdootedThread {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ut_id")
    private int utId;

    @Column(name = "account_id")
    private int accountId;

    @Column(name = "thread_id")
    private int threadId;

    public int getUtId() {
        return this.utId;
    }

    public int getAccountId() {
        return this.accountId;
    }

    public int getThreadId() {
        return this.threadId;
    }

    public void setUtId(int utId) {
        this.utId = utId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public void setThreadId(int threadId) {
        this.threadId = threadId;
    }

    @Override
    public String toString() {
        return "UpdootedThread{" +
                "utId=" + utId +
                ", accountId=" + accountId +
                ", threadId=" + threadId +
                '}';
    }
}
