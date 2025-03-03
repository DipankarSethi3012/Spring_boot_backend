package com.dipankar.dto;

import lombok.Data;


public class RevenueChart {
    private String date;
    private double revenue;

    public RevenueChart(){}

    public RevenueChart(String date, double revenue) {
        this.date = date;
        this.revenue = revenue;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

}
