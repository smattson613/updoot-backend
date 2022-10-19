package dev.updooters.entities;

import javax.persistence.*;

@Entity
@Table(name = "thread")
public class Thread {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "thread_id")
    private int threadId;

    @Column(name = "account_id")
    private int accountId;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "updoot")
    private int updoot;

    public Thread() {
    }

    public Thread(int threadId, int accountId, String title, String content, int updoot) {
        this.threadId = threadId;
        this.accountId = accountId;
        this.title = title;
        this.content = content;
        this.updoot = updoot;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        return "Thread{" +
                "threadId=" + threadId +
                ", accountId=" + accountId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", updoot=" + updoot +
                '}';
    }
}
