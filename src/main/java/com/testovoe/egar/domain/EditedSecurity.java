package com.testovoe.egar.domain;

public class EditedSecurity {

    private String newContent;
    private int index;
    private String colID;

    public EditedSecurity(){}

    public EditedSecurity(String c, int i, String id){
        this.newContent = c;
        this.index = i;
        this.colID = id;
    }

    public String getNewContent() {
        return newContent;
    }

    public void setNewContent(String newContent) {
        this.newContent = newContent;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getColID() {
        return colID;
    }

    public void setColID(String colID) {
        this.colID = colID;
    }

    @Override
    public String toString() {
        return this.getNewContent() +"; "+ this.getIndex() +"; "+ this.getColID();
    }

}
