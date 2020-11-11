package com.company.object;

public class Patient extends Person {
    @Override
    public String toString() {
        return super.toString()+";"+address+";"+diseases+";"+insuranceNumber;
    }

    private String address;
    private String diseases;
    private String insuranceNumber;

    public Patient(String address, String diseases, String insuranceNumber) {
        this.address = address;
        this.diseases = diseases;
        this.insuranceNumber = insuranceNumber;
    }

    public Patient(){

    }
    public Patient(String name, String sex, byte age, int id, String address, String diseases, String insuranceNumber) {
        super(name, sex, age, id);
        this.address = address;
        this.diseases = diseases;
        this.insuranceNumber = insuranceNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDiseases() {
        return diseases;
    }

    public void setDiseases(String diseases) {
        this.diseases = diseases;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }


}
