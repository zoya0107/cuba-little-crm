-- begin CUBALITTLECRM_PERSON
create unique index IDX_CUBALITTLECRM_PERSON_UK_LOGIN on CUBALITTLECRM_PERSON (LOGIN) where DELETE_TS is null ^
-- end CUBALITTLECRM_PERSON
-- begin CUBALITTLECRM_MESSAGE
alter table CUBALITTLECRM_MESSAGE add constraint FK_CUBALITTLECRM_MESSAGE_ON_AUTHOR_LOGIN foreign key (AUTHOR_LOGIN) references CUBALITTLECRM_PERSON(ID)^
alter table CUBALITTLECRM_MESSAGE add constraint FK_CUBALITTLECRM_MESSAGE_ON_RECEIVER_LOGIN foreign key (RECEIVER_LOGIN) references CUBALITTLECRM_PERSON(ID)^
create index IDX_CUBALITTLECRM_MESSAGE_ON_AUTHOR_LOGIN on CUBALITTLECRM_MESSAGE (AUTHOR_LOGIN)^
create index IDX_CUBALITTLECRM_MESSAGE_ON_RECEIVER_LOGIN on CUBALITTLECRM_MESSAGE (RECEIVER_LOGIN)^
-- end CUBALITTLECRM_MESSAGE