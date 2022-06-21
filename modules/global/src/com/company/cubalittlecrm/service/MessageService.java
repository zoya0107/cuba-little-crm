package com.company.cubalittlecrm.service;

import com.company.cubalittlecrm.entity.MessageModel;

import java.util.List;

public interface MessageService {
    String NAME = "cubalittlecrm_MessageService";
    List<MessageModel> findMessagesByAuthor(String login);
    List<MessageModel> findMessagesByReceiver(String login);
}