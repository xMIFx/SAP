package com.xMIFx.SAP.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PERSONS")
public class Person extends User {

    public Person(String login, String password) {
        super(login, password, UserType.PERSON);
    }
}
