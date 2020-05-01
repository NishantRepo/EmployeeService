--liquibase formatted sql
--changeset test:1.1.0

insert into STUDENT(ID, NAME, ADDRESS) VALUES(123,'test_java', 'pune');
commit;

--changeset test:1.2.0

insert into STUDENT(ID, NAME, ADDRESS) VALUES(321,'test_ddb', 'mumbai');
insert into STUDENT(ID, NAME, ADDRESS) VALUES(432,'test_web', 'nagpur');
insert into STUDENT(ID, NAME, ADDRESS) VALUES(326,'test-backend', 'Hnjewadi');
commit;
