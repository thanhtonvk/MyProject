package com.company.inputObject;

import com.company.object.*;
import java.util.ArrayList;
import java.util.Scanner;

//String name, String sex, byte age, int id, byte experience, String faculty, double evaluate, String patient
public class InputObjectDoctor {
    Scanner scanner = new Scanner(System.in);
    public void InputDoctor(ArrayList<Doctor> doctorArrayList) {
        System.out.println("+--------------------------------------------------------+");
        System.out.println("|                 Nhập thông tin bệnh nhân               |");
        System.out.println("+--------------------------------------------------------+");
        doctorArrayList.add(new Doctor(inputName(),inputSex(),inputAge(),getId(doctorArrayList),inputExperience(),inputFaculty()));
    }
    public String inputName() {
        String name;
        do {
            System.out.print("Input name: ");
            name = scanner.nextLine();
        }while (name.equals(""));
        return name;
    }
    public byte inputAge(){
        byte age;
        do {
            System.out.print("Input age: ");
            age = scanner.nextByte();
        }while(!(age>25&&age<60));
        return age;
    }
    public int getId(ArrayList<Doctor> doctorArrayList){
        return doctorArrayList.size();
    }
    public String inputSex(){
        System.out.println("1.Male 2.Female");
        int choose = Integer.parseInt(scanner.nextLine());
        if(choose==1) return "Male";
        return "Female";
    }
    public byte inputExperience(){
        byte exp;
        do{
            System.out.print("Input years of experience: ");
            exp = scanner.nextByte();
        }while (exp<0);
        return exp;
    }
    public String inputFaculty(){
        String faculty;
        do{
            System.out.print("Input Faculty: ");
            faculty = scanner.nextLine();
        }while(faculty.equals(""));
        return  faculty;
    }
}
