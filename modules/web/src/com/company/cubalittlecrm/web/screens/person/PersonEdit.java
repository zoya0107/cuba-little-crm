package com.company.cubalittlecrm.web.screens.person;

import com.haulmont.cuba.gui.screen.*;
import com.company.cubalittlecrm.entity.PersonModel;

@UiController("cubalittlecrm_Person.edit")
@UiDescriptor("person-edit.xml")
@EditedEntityContainer("personDc")
@LoadDataBeforeShow
public class PersonEdit extends StandardEditor<PersonModel> {
}