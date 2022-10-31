package com.bridgeLabz;

/**UC12
 * Draw the ER Diagram for
 Address Book Service DB

 - Identifies the Entities – Entities
 can be Identified using
 Normalization Technique
 - Check each attribute and see if

 they are Composite or Multi-
 Valued
 */
public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        /*
        create database  Address_Book_System;
        show databases;
        use Address_Book_System;
        create table addressbook(firstName varchar(255) ,lastName varchar(255) not null,address varchar(255) Not Null,
        city varchar(255) Not Null,state  varchar(255) Not Null,zip  varchar(255) Not Null,PhoneNumber varchar(255) Not Null,email  varchar(255) Not Null,primary key (firstName));
        alter table addressbook rename to contact_person;
        select * from contact_person;
        insert into contact_person (firstName,lastName,address,city,state,zip,PhoneNumber,email)
        values('Bhuvanesh','sagar','kompally','Hyderabad','TS','500055','9391332668','bhuvanesh@gmail.com'),
              ('raj','kumar','Jeedimetla','Kurnool','AP','54','2345612345','raju@gmail.com'),
              ('Radhika','sagar','secundrabad','secundrabad','TS','500054','773082683','radhika@gmail.com');
        update contact_person set firstName='Harsha' where firstName='Bhuvanesh';
        delete from contact_person where firstName='raj';
        select * from contact_person where state='TS';
        select * from contact_person where city='Hyderabad';
        select count(city) from contact_person where state='TS';
        select count(state) from contact_person;
        select * from contact_person order by  city asc;
        select * from contact_person where city='Hyderabad' order by  firstName asc;
        alter table contact_person add addressBookName varchar(25),add type varchar(25);
        select * from contact_person;
        alter table contact_person drop primary key;
        alter table contact_person add id int auto_increment primary key;
        update contact_person set type = 'family' where id='1';
        update contact_person set type ='friend' where id='2';
        select count(type) from contact_person;
        select count(type) from contact_person where type ='friend';
        alter table contact_person drop column id;
        alter table contact_person add id int auto_increment primary key first;
        insert into contact_person (firstName,lastName,address,city,state,zip,PhoneNumber,email,addressBookName,type)
        values('Bhuvanesh','sagar','kompally','Hyderabad','TS','500055','9391332668','bhuvanesh@gmail.com','a1','family'),
              ('raj','kumar','Jeedimetla','Kurnool','AP','54','2345612345','raju@gmail.com','a2','friend'),
              ('Radhika','sagar','secundrabad','secundrabad','TS','500054','773082683','radhika@gmail.com','a1','family');
         describe  contact_person;

         */
    }
}
