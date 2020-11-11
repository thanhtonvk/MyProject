package com.company.inputObject;

import com.company.object.Service;

import java.util.ArrayList;
import java.util.Scanner;

public class InputObjectServices {
//    String servicecode, String servicename, int cost
    Scanner scanner = new Scanner(System.in);
    public void inputServices(ArrayList<Service>serviceArrayList){
        serviceArrayList.add(new Service(inputServiceCode(),inputSeviceName(),inputCost()));
    }

    public int inputCost() {
        System.out.println("Input cost: ");
        int cost = Integer.parseInt(scanner.nextLine());
        return cost;
    }

    public String inputSeviceName() {
        System.out.println("Input sevice name");
        String svname = scanner.nextLine();
        return svname;
    }

    public String inputServiceCode() {
        System.out.println("Input servicecode: ");
        String svcode = scanner.nextLine();
        return  svcode;
    }
}
