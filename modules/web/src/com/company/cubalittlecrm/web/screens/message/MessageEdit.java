package com.company.cubalittlecrm.web.screens.message;

import com.company.cubalittlecrm.entity.PersonModel;
import com.company.cubalittlecrm.service.PersonService;
import com.haulmont.cuba.core.global.UserSessionSource;
import com.haulmont.cuba.gui.screen.*;
import com.company.cubalittlecrm.entity.MessageModel;

import javax.inject.Inject;
import java.time.LocalDateTime;

@UiController("cubalittlecrm_Message.edit")
@UiDescriptor("message-edit.xml")
@EditedEntityContainer("messageDc")
@LoadDataBeforeShow
public class MessageEdit extends StandardEditor<MessageModel> {

    @Inject
    private UserSessionSource userSessionSource;
    @Inject
    private PersonService personService;

    @Subscribe
    public void onInitEntity(InitEntityEvent<MessageModel> event) {
        String currentUserLogin = userSessionSource.getUserSession().getUser().getLogin();
        PersonModel person = personService.findPersonByLogin(currentUserLogin);
        event.getEntity().setAuthor(person);
        event.getEntity().setDate(LocalDateTime.now());
    }
}