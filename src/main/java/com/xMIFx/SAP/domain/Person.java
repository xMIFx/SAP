package com.xMIFx.SAP.domain;

public class Person extends User {

    public Person(String login, String password) {
        super(login, password, UserType.PERSON);
    }
}
