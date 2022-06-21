package com.company.cubalittlecrm.service;

import com.company.cubalittlecrm.entity.MessageModel;
import com.company.cubalittlecrm.entity.PersonModel;
import com.haulmont.cuba.core.global.DataManager;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service(MessageService.NAME)
public class MessageServiceBean implements MessageService {

    @Inject
    private DataManager dataManager;
    @Inject
    private PersonService personService;

    @Override
    public List<MessageModel> findMessagesByAuthor(String authorLogin) {
        PersonModel person = personService.findPersonByLogin(authorLogin);
        return dataManager.load(MessageModel.class).query("select m from cubalittlecrm_Message m where m.author = :author")
                .parameter("author", person).list();
    }

    @Override
    public List<MessageModel> findMessagesByReceiver(String receiverLogin) {
        PersonModel person = personService.findPersonByLogin(receiverLogin);
        return dataManager.load(MessageModel.class).query("select m from cubalittlecrm_Message m where m.receiver = :receiver")
                .parameter("receiver", person).list();
    }
}