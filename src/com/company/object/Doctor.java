package com.company.object;

public class Doctor extends Person {

    private byte experience;
    private String faculty;

    @Override
    public String toString() {
        return super.toString()+";"+experience+";"+faculty;
    }

    public Doctor(){

    }
    public Doctor(byte experience, String faculty) {
        this.experience = experience;
        this.faculty = faculty;

    }

    public Doctor(String name, String sex, byte age, int id, byte experience, String faculty) {
        super(name, sex, age, id);
        this.experience = experience;
        this.faculty = faculty;

    }

    public byte getExperience() {
        return experience;
    }

    public void setExperience(byte experience) {
        this.experience = experience;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
