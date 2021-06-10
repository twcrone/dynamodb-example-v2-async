package com.newrelic.agent.dynamodbexample;


public class ProductInfo {
    private String id;
    private String msrp;
    private String cost;

    public ProductInfo() {}

    public ProductInfo(String cost, String price) {
        this.cost = cost;
        this.msrp = price;
    }

    public String getId() {
        return id;
    }

    public String getMsrp() {
        return msrp;
    }

    public String getCost() {
        return cost;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMsrp(String msrp) {
        this.msrp = msrp;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}