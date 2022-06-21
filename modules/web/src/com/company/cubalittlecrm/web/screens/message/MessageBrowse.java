package com.company.cubalittlecrm.web.screens.message;

import com.company.cubalittlecrm.entity.MessageModel;
import com.company.cubalittlecrm.service.MessageService;
import com.haulmont.cuba.core.global.LoadContext;
import com.haulmont.cuba.core.global.UserSessionSource;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Inject;
import java.util.List;

@UiController("cubalittlecrm_Message.browse")
@UiDescriptor("message-browse.xml")
@LookupComponent("messagesTable")
@LoadDataBeforeShow
public class MessageBrowse extends StandardLookup<MessageModel> {
    @Inject
    private UserSessionSource userSessionSource;
    @Inject
    private MessageService messageService;

//    @Install(to = "messagesDl", target = Target.DATA_LOADER)
//    protected List<MessageModel> messagesDlLoadDelegate(LoadContext<MessageModel> loadContext) {
//        String currentUserLogin = userSessionSource.getUserSession().getUser().getLogin();
//        return messageService.findMessagesByReceiver(currentUserLogin);
//    }

    @Install(to = "messagesDl", target = Target.DATA_LOADER)
    protected List<MessageModel> messagesDlLoadDelegate(LoadContext<MessageModel> loadContext) {
        String currentUserLogin = userSessionSource.getUserSession().getUser().getLogin();
        return messageService.findMessagesByAuthor(currentUserLogin);
    }
}