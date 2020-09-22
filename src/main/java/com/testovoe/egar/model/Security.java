package com.testovoe.egar.model;

import javax.persistence.*;
import java.util.Objects;


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

    @Override
    public int hashCode() {
        return Objects.hash(id, date, company, cost);
    }

    @Override
    public String toString() {
        return "id: " + id + "; " +
                "date: " + date + "; " +
                "company: " + company + "; " +
                "cost: " + cost;
    }
}
