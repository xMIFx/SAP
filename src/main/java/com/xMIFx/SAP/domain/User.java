package com.xMIFx.SAP.domain;

public class User {
    protected final String login;
    protected final String password;
    protected final UserType userType;

    public User(String login, String password, UserType userType) {
        this.login = login;
        this.password = password;
        this.userType = userType;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
