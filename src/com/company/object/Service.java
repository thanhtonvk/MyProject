package com.company.object;

public class Service {
    private String servicecode;
    private String servicename;
    private int cost;

    @Override
    public String toString() {
        return servicecode+";"+servicename+";"+cost;
    }

    public Service(){

    }
    public String getServicecode() {
        return servicecode;
    }

    public void setServicecode(String servicecode) {
        this.servicecode = servicecode;
    }

    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Service(String servicecode, String servicename, int cost) {
        this.servicecode = servicecode;
        this.servicename = servicename;
        this.cost = cost;
    }
}
