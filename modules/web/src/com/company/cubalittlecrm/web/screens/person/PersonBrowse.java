package com.company.cubalittlecrm.web.screens.person;

import com.haulmont.cuba.gui.screen.*;
import com.company.cubalittlecrm.entity.PersonModel;

@UiController("cubalittlecrm_Person.browse")
@UiDescriptor("person-browse.xml")
@LookupComponent("personsTable")
@LoadDataBeforeShow
public class PersonBrowse extends StandardLookup<PersonModel> {
}