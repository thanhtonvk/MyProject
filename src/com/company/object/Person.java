package com.company.object;

public class Person {
    @Override
    public String toString() {
        return name+";"+sex+";"+age+";"+id;
    }

    private String name;
    private String sex;
    private byte age;
    private int id;
    public Person(){


    }
    public Person(String name, String sex, byte age, int id) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.id = id;
    }
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public void setAge(byte age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
