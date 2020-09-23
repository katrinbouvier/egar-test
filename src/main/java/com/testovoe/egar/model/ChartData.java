package com.testovoe.egar.model;

import java.util.List;

public class ChartData {

    private Boolean success;
    private List<String> dates;
    private List<Integer> costs;

    public ChartData() {}

    public ChartData(List<String> dates, List<Integer> costs) {
        this.dates = dates;
        this.costs = costs;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public List<String> getDates() {
        return dates;
    }

    public void setDates(List<String> dates) {
        this.dates = dates;
    }

    public List<Integer> getCosts() {
        return costs;
    }

    public void setCosts(List<Integer> costs) {
        this.costs = costs;
    }

}
