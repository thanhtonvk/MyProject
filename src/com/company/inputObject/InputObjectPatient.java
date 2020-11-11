package com.company.inputObject;

import com.company.object.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class InputObjectPatient {
    Scanner scanner = new Scanner(System.in);

    public void inputPatient(ArrayList<Patient> patientArrayList) {
        System.out.println("+--------------------------------------------------------+");
        System.out.println("|               Nhập thông tin bệnh nhân                 |");
        patientArrayList.add(new Patient(inputName(),inputSex(),inputAge(),getId(patientArrayList),inputAddress(),inputDiseaes(),inputInsuranceNumber()));
    }

    //    String name, String sex, byte age, int id, String address, String diseases, String insuranceNumber
    public String inputName() {
        String name;
        do {
            System.out.println("+--------------------------------------------------------+");
            System.out.print("Nhập tên       | ");
            name = scanner.nextLine();
        } while (name.equals(""));
        return name;
    }
    public String inputSex() {
        System.out.println("|________________________________________________________|");
        System.out.print("Nhập giới tính: 1.Nam 2.Nữ | ");
        int choose = Integer.parseInt(scanner.nextLine());
        if (choose == 1) return "Nam";
        else if(choose==2) return  "Nữ";
        return "Khác";
    }
    public byte inputAge() {
        byte age;
        do {
            System.out.println("|________________________________________________________|");
            System.out.print("Nhập tuổi      | ");
            age = scanner.nextByte();
        } while (!(age > 25 && age < 60));
        return age;
    }

    public int getId(ArrayList<Patient> patientArrayList) {
        return patientArrayList.size();
    }
    public String inputAddress(){
        String address;
        do{
            System.out.println("|________________________________________________________|");
            System.out.print("Nhập địa chỉ   | ");
            address = scanner.nextLine();
        }while(address.equals(""));
        return  address;
    }
    public String inputDiseaes(){
        String diseaes;
        do{
            System.out.println("|________________________________________________________|");
            System.out.print("Nhập bệnh      | ");
            diseaes = scanner.nextLine();
        }while(diseaes.equals(""));
        return  diseaes;
    }
    public String inputInsuranceNumber(){
        String insuranceNumber;
        System.out.println("|________________________________________________________|");
        System.out.print("Nhập số BHYT   | ");
        insuranceNumber = scanner.nextLine();
        System.out.println("|________________________________________________________|");
        return insuranceNumber;
    }

}
