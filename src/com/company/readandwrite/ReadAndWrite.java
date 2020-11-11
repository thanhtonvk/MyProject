package com.company.readandwrite;

import com.company.object.Doctor;
import com.company.object.Patient;
import com.company.object.Service;

import java.io.*;
import java.util.ArrayList;

public class ReadAndWrite {

    public void WriteDoctor(ArrayList<Doctor>doctorArrayList) throws IOException {

        FileWriter fileWriter = new FileWriter("Object/doctor.txt");
        for (Doctor a:
             doctorArrayList) {
            fileWriter.write(a.toString()+"\n");
        }
        fileWriter.close();
    }
    public void ReadDoctor(ArrayList<Doctor>doctorArrayList) throws IOException {
        FileReader fileReader= new FileReader("Object/doctor.txt");
        BufferedReader bufferedReader= new BufferedReader(fileReader);
        String line;
        while((line= bufferedReader.readLine())!=null){
            doctorArrayList.add(new Doctor(line.split(";")[0],line.split(";")[1],Byte.parseByte(line.split(";")[2]),Integer.parseInt(line.split(";")[3]),Byte.parseByte(line.split(";")[4]),line.split(";")[5]));
        }
        bufferedReader.close();
        fileReader.close();
    }
    public void WritePatient(ArrayList<Patient>patientArrayList) throws IOException {
        FileWriter fileWriter = new FileWriter("Object/patient.txt");
        for (Patient a:
                patientArrayList) {
            fileWriter.write(a.toString()+"\n");
        }
        fileWriter.close();
    }
    public void ReadPatient(ArrayList<Patient>patientArrayList) throws IOException {
        FileReader fileReader= new FileReader("Object/patient.txt");
        BufferedReader bufferedReader= new BufferedReader(fileReader);
        String line;
//        String name, String sex, byte age, int id, String address, String diseases, String insuranceNumber
        while((line= bufferedReader.readLine())!=null){
            patientArrayList.add(new Patient(line.split(";")[0],line.split(";")[1],Byte.parseByte(line.split(";")[2]),Integer.parseInt(line.split(";")[3]),line.split(";")[4],line.split(";")[5],line.split(";")[6]));
        }
        bufferedReader.close();
        fileReader.close();
    }
    public void ReadService(ArrayList<Service>serviceArrayList) throws IOException {
        FileReader fileReader = new FileReader("Object/service.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while((line=bufferedReader.readLine())!=null){
            serviceArrayList.add(new Service(line.split(";")[0],line.split(";")[1],Integer.parseInt(line.split(";")[2])));
        }
        bufferedReader.close();
        fileReader.close();
    }
    public void WriteService(ArrayList<Service>serviceArrayList) throws IOException {
        FileWriter fileWriter = new FileWriter("Object/service.txt");
        for (Service a:
                serviceArrayList) {
            fileWriter.write(a.toString()+"\n");
        }
        fileWriter.close();
      
    }
}
