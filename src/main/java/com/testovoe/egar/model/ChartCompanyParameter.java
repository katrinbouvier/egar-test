package com.testovoe.egar.model;

public class ChartCompanyParameter {

    private String company;

    public ChartCompanyParameter() {}

    public ChartCompanyParameter(String parameterCompany) {
        this.company = parameterCompany;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String parameterCompany) {
        this.company = parameterCompany;
    }

    @Override
    public String toString() {
        return this.getCompany();
    }
}
