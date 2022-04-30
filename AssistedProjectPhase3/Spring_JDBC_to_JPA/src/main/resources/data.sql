create table person
(
 id integer not null,
 name varchar(255) not null,
 location varchar(255),
 birth_date timestamp,
 primary key(id)
);

INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE)
VALUES(1001,'Parth','Chandrapur',sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE)
VALUES(1002,'Pradnya','Nagpur',sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE)
VALUES(1003,'Arshad','Chandrapur',sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE)
VALUES(1004,'Sargam','Nagpur',sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE)
VALUES(1005,'Suprit','Chandrapur',sysdate());