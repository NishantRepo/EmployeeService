--liquibase formatted sql
--changeset test:1.0.0 

CREATE TABLE STUDENT(ID int NOT NULL PRIMARY KEY, NAME varchar(200), ADDRESS varchar(200));

--rollback drop table STUDENT;