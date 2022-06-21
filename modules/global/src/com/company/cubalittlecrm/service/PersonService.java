package com.company.cubalittlecrm.service;

import com.company.cubalittlecrm.entity.PersonModel;


public interface PersonService {
    String NAME = "cubalittlecrm_PersonService";
    PersonModel findPersonByLogin(String login);
}