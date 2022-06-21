package com.company.cubalittlecrm.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Table(name = "CUBALITTLECRM_MESSAGE")
@Entity(name = "cubalittlecrm_Message")
@NamePattern("%s|topic")
public class MessageModel extends StandardEntity {
    private static final long serialVersionUID = -7730005602639734593L;

    @NotNull
    @Column(name = "TOPIC", nullable = false)
    private String topic;

    @Lob
    @Column(name = "CONTENT")
    private String content;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "AUTHOR_LOGIN")
    private PersonModel author;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "RECEIVER_LOGIN")
    private PersonModel receiver;

    @NotNull
    @Column(name = "DATE", nullable = false)
    private LocalDateTime date;

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public PersonModel getReceiver() {
        return receiver;
    }

    public void setReceiver(PersonModel receiver) {
        this.receiver = receiver;
    }

    public PersonModel getAuthor() {
        return author;
    }

    public void setAuthor(PersonModel author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}