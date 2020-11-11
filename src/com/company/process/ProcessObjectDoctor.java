package com.company.process;
import com.company.inputObject.InputObjectDoctor;
import com.company.object.Doctor;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProcessObjectDoctor {
    private void showDoctor(Doctor doctor) {
//        String name, String sex, byte age, int id, byte experience, String faculty
        System.out.printf("%25s|%25s|%25s|%25s|%25s|%25s|\n", doctor.getId(), doctor.getName(), doctor.getSex(), doctor.getAge(), doctor.getExperience(), doctor.getFaculty());
    }

    public void showAllDoctor(ArrayList<Doctor> doctorArrayList) {
        System.out.printf("%25s|%25s|%25s|%25s|%25s|%25s|\n", "ID", "Name", "Sex", "Age", "Year of Experience", "Faculty");
        for (Doctor doctor : doctorArrayList
        ) {
            showDoctor(doctor);
        }
    }

    public void editDoctor(ArrayList<Doctor> doctorArrayList, String keyword, Doctor doctor, InputObjectDoctor inputObjectDoctor) {
        boolean kt = false;
        for (int i = 0; i < doctorArrayList.size(); i++) {
            if (keyword.equalsIgnoreCase(doctorArrayList.get(i).getName()) || keyword.equalsIgnoreCase(String.valueOf(doctorArrayList.get(i).getId()))) {
                kt = true;
                String name;
                String sex;
                byte age;
                byte yoe;
                String fal;
                int id = doctorArrayList.get(i).getId();
                System.out.println("Press 0 to skip");
                name = inputObjectDoctor.inputName();
                if (name.equals("0")) name = doctorArrayList.get(i).getName();
                sex = inputObjectDoctor.inputSex();
                if (sex.equals("0")) sex = doctorArrayList.get(i).getSex();
                age = inputObjectDoctor.inputAge();
                if (age == 0) age = doctorArrayList.get(i).getAge();
                yoe = inputObjectDoctor.inputExperience();
                if (yoe == 0) yoe = doctorArrayList.get(i).getExperience();
                fal = inputObjectDoctor.inputFaculty();
                if (fal.equals("0")) fal = doctorArrayList.get(i).getFaculty();
//                String name, String sex, byte age, int id, byte experience, String faculty
                doctorArrayList.set(i, new Doctor(name, sex, age, id, yoe, fal));
                System.out.println("Edit Successful!");
            }
        }
        if (kt == false) System.out.println("Can not find ID or Name!");
    }

    public  void deleteDoctor(ArrayList<Doctor> doctorArrayList, String keyword) {
        boolean kt = false;
        for (int i = 0; i < doctorArrayList.size(); i++) {
            if (doctorArrayList.get(i).getName().toLowerCase().endsWith(keyword.toLowerCase()) || String.valueOf(doctorArrayList.get(i).getId()).equals(keyword)) {
                doctorArrayList.remove(i);
                kt = true;
                System.out.println("Delete Succescful");
            }
        }
        if (kt == false) System.out.println("Can not find ID or Name!");
    }
    public  void findDoctor(ArrayList<Doctor>doctorArrayList,String keyword){
        boolean kt = true;

        for (Doctor doctor:doctorArrayList
             ) {
            if(doctor.getId()==Integer.parseInt(keyword)||doctor.getName().toLowerCase().endsWith(keyword.toLowerCase())||doctor.getName().equalsIgnoreCase(keyword)){
                kt = false;
                showDoctor(doctor);
            }
        }
        if(kt ==true) System.out.println("Cannot find doctor");
    }
    public void sortNameAZ(ArrayList<Doctor>doctorArrayList){
        Collections.sort(doctorArrayList, new Comparator<Doctor>() {
            @Override
            public int compare(Doctor o1, Doctor o2) {
                String string1 = Normalizer.normalize(o1.getName(), Normalizer.Form.NFKD).replaceAll("\\p{M}","").toLowerCase().replace("đ","d");
                String string2 = Normalizer.normalize(o2.getName(),Normalizer.Form.NFKD).replaceAll("\\p{M}","").toLowerCase().replace("đ","d");
                String []tmp1 = string1.strip().split(" ");
                String []tmp2 = string2.strip().split(" ");
                return tmp1[tmp1.length-1].compareToIgnoreCase(tmp2[tmp2.length-1]);
            }
        });
    }
    public void sortNameZA(ArrayList<Doctor>doctorArrayList){
        Collections.sort(doctorArrayList, new Comparator<Doctor>() {
            @Override
            public int compare(Doctor o1, Doctor o2) {
                String string1 = Normalizer.normalize(o1.getName(), Normalizer.Form.NFKD).replaceAll("\\p{M}","").toLowerCase().replace("đ","d");
                String string2 = Normalizer.normalize(o2.getName(),Normalizer.Form.NFKD).replaceAll("\\p{M}","").toLowerCase().replace("đ","d");
                String []tmp1 = string1.strip().split(" ");
                String []tmp2 = string2.strip().split(" ");
                return tmp2[tmp2.length-1].compareToIgnoreCase(tmp1[tmp1.length-1]);
            }
        });
    }
    public void sortExperienceLowtoHigh(ArrayList<Doctor>doctorArrayList){
        Collections.sort(doctorArrayList, new Comparator<Doctor>() {
            @Override
            public int compare(Doctor o1, Doctor o2) {
                if(o1.getExperience()>o2.getExperience()) return 1;
                else  return -1;
            }
        });
    }
    public void sortExperienceHightoLow(ArrayList<Doctor>doctorArrayList){
        Collections.sort(doctorArrayList, new Comparator<Doctor>() {
            @Override
            public int compare(Doctor o1, Doctor o2) {
                if(o1.getExperience()>o2.getExperience()) return -1;
                else  return 1;
            }
        });
    }
}
