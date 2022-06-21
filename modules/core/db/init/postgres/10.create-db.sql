-- begin CUBALITTLECRM_PERSON
create table CUBALITTLECRM_PERSON (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRST_NAME varchar(255) not null,
    LAST_NAME varchar(255) not null,
    LOGIN varchar(255) not null,
    --
    primary key (ID)
)^
-- end CUBALITTLECRM_PERSON
-- begin CUBALITTLECRM_MESSAGE
create table CUBALITTLECRM_MESSAGE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TOPIC varchar(255) not null,
    CONTENT text,
    AUTHOR_LOGIN uuid not null,
    RECEIVER_LOGIN uuid not null,
    DATE timestamp not null,
    --
    primary key (ID)
)^
-- end CUBALITTLECRM_MESSAGE
