package com.testovoe.egar.domain;

import javax.persistence.*;


@Entity
@Table(name = "securities")
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String date;

    private String company;

    private int cost;

    public Security(String d, String c, int cost){
        this.date = d;
        this.company = c;
        this.cost = cost;
    }

    public Security(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
