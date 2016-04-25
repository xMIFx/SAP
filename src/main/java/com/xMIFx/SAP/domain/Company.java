package com.xMIFx.SAP.domain;

import java.util.List;

public class Company extends User {
    private List<CompanyProject> companyProjects;

    public Company(String login, String password) {
        super(login, password, UserType.COMPANY);
    }
}
