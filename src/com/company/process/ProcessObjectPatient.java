package com.company.process;

import com.company.inputObject.InputObjectDoctor;
import com.company.inputObject.InputObjectPatient;
import com.company.object.Doctor;
import com.company.object.Patient;

import java.util.ArrayList;

public class ProcessObjectPatient {
    public void showPatient(Patient patient) {
        //    String name, String sex, byte age, int id, String address, String diseases, String insuranceNumber
        System.out.println("+--------------------|--------------------|--------------------|--------------------|--------------------|--------------------|--------------------+");
        System.out.printf("|%20s|%20s|%20s|%20s|%20s|%20s|%20s|\n",patient.getId(), patient.getName(), patient.getSex(), patient.getAge(), patient.getAddress(), patient.getDiseases(), patient.getInsuranceNumber());
        System.out.println("+--------------------|--------------------|--------------------|--------------------|--------------------|--------------------|--------------------+");
    }

    public void showAllPatient(ArrayList<Patient> patientArrayList) {
        System.out.println("+--------------------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.println("|                                                 HIỂN THỊ DANH SÁCH BỆNH NHÂN                                                                     |");
        System.out.println("+--------------------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.printf("|%20s|%20s|%20s|%20s|%20s|%20s|%20s|\n","ID","Họ và tên","Giới tính","Tuổi","Địa chỉ","Bệnh","Số BHYT");
        for (Patient patient : patientArrayList
        ) {
            showPatient(patient);
        }
    }

    public void editPatient(ArrayList<Patient> patientArrayList, String keyword, InputObjectPatient inputObjectPatient) {
        boolean kt = false;
        //    String name, String sex, byte age, int id, String address, String diseases, String insuranceNumber
        for (int i = 0; i < patientArrayList.size(); i++) {
            if (keyword.equalsIgnoreCase(patientArrayList.get(i).getName()) || keyword.equalsIgnoreCase(String.valueOf(patientArrayList.get(i).getId()))) {
                kt = true;

                System.out.println("Press 0 to skip");
                String name = patientArrayList.get(i).getName();
                if (name.equals("0")) name = patientArrayList.get(i).getName();


                String sex = inputObjectPatient.inputSex();
                if (sex.equals("0")) sex = patientArrayList.get(i).getSex();


                byte age = inputObjectPatient.inputAge();
                if (age == 0) age = patientArrayList.get(i).getAge();


                String address = inputObjectPatient.inputAddress();
                if (address.equals("0")) address = patientArrayList.get(i).getAddress();


                String diseaes = inputObjectPatient.inputDiseaes();
                if (diseaes.equals("0")) diseaes = patientArrayList.get(i).getDiseases();

                int id = patientArrayList.get(i).getId();

                String insurance = inputObjectPatient.inputInsuranceNumber();
                if (insurance.equals("0")) insurance = patientArrayList.get(i).getInsuranceNumber();


                System.out.println("Edit Successful!");
                patientArrayList.set(i, new Patient(name, sex, age, id, address, diseaes, insurance));

            }
        }
        if (kt == false) System.out.println("Can not find ID or Name!");
    }

    public void findPatient(ArrayList<Patient> patientArrayList, String keyword) {
        boolean kt = true;
        System.out.println("+--------------------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.println("|                                                 HIỂN THỊ DANH SÁCH BỆNH NHÂN                                                                     |");
        System.out.println("+--------------------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.printf("|%20s|%20s|%20s|%20s|%20s|%20s|%20s|\n","ID","Họ và tên","Giới tính","Tuổi","Địa chỉ","Bệnh","Số BHYT");
        for (Patient patient : patientArrayList
        ) {
            if (patient.getName().toLowerCase().endsWith(keyword.toLowerCase()) || patient.getId() == Integer.parseInt(keyword) || patient.getInsuranceNumber().equalsIgnoreCase(keyword)) {
                kt = false;
                showPatient(patient);
            }
        }
        if (kt == true) System.out.println("Cannot find patient");
    }

    public void deletePatient(ArrayList<Patient> patientArrayList, String keyword) {
        boolean kt = false;
        for (int i = 0; i < patientArrayList.size(); i++) {
            if (keyword.equalsIgnoreCase(patientArrayList.get(i).getName()) || keyword.equalsIgnoreCase(String.valueOf(patientArrayList.get(i).getId()))) {
                patientArrayList.remove(i);
                kt = true;
                System.out.println("Delete Successful");
            }
        }
        if(kt == false) System.out.println("Can not find id or name");
    }

}
