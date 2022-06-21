package com.company.cubalittlecrm.web.screens.message;

import com.haulmont.cuba.gui.screen.*;
import com.company.cubalittlecrm.entity.MessageModel;

@UiController("cubalittlecrm_Message.browse")
@UiDescriptor("message-browse.xml")
@LookupComponent("messagesTable")
@LoadDataBeforeShow
public class MessageBrowse extends StandardLookup<MessageModel> {
}