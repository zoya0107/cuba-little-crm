package com.company.cubalittlecrm.service;

import com.company.cubalittlecrm.entity.PersonModel;
import com.haulmont.cuba.core.global.DataManager;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service(PersonService.NAME)
public class PersonServiceBean implements PersonService {
    @Inject
    private DataManager dataManager;

    @Override
    public PersonModel findPersonByLogin(String login) {
        PersonModel person = dataManager.loadValue("select p from cubalittlecrm_Person p where p.login = :login", PersonModel.class)
                .parameter("login", login).one();
        return person;
    }
}