package com.testovoe.egar.model;

public class EditedSecurity {

    private String content;
    private int index;
    private String id;

    public EditedSecurity(){}

    public EditedSecurity(String c, int i, String id){
        this.content = c;
        this.index = i;
        this.id = id;
    }

    public String getcontent() {
        return content;
    }

    public void setcontent(String content) {
        this.content = content;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return this.getcontent() +"; "+ this.getIndex() +"; "+ this.getid();
    }

}
