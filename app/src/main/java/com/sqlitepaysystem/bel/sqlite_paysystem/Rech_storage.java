package com.sqlitepaysystem.bel.sqlite_paysystem;

public class Rech_storage {
    String viewMobile,viewAmount,viewDate,viewTime;

    public Rech_storage(String viewMobile, String viewAmount, String viewDate, String viewTime) {
        this.viewMobile = viewMobile;
        this.viewAmount = viewAmount;
        this.viewDate = viewDate;
        this.viewTime = viewTime;
    }
    public Rech_storage(){}

    public String getViewMobile() {
        return viewMobile;
    }

    public void setViewMobile(String viewMobile) {
        this.viewMobile = viewMobile;
    }

    public String getViewAmount() {
        return viewAmount;
    }

    public void setViewAmount(String viewAmount) {
        this.viewAmount = viewAmount;
    }

    public String getViewDate() {
        return viewDate;
    }

    public void setViewDate(String viewDate) {
        this.viewDate = viewDate;
    }

    public String getViewTime() {
        return viewTime;
    }

    public void setViewTime(String viewTime) {
        this.viewTime = viewTime;
    }
}
