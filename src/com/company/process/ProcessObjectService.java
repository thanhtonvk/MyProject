package com.company.process;

import com.company.inputObject.InputObjectServices;
import com.company.object.Service;

import java.util.ArrayList;

public class ProcessObjectService {
    //    String servicecode, String servicename, int cost
    public void show(Service service) {
        System.out.printf("%25s|%25s|%25s\n", service.getServicecode(), service.getServicename(), service.getCost());
    }

    public void showAllService(ArrayList<Service> serviceArrayList) {
        System.out.printf("%25s|%25s|%25s\n", "Code", "Name", "Cost");
        for (Service service :
                serviceArrayList) {
            show(service);
        }
    }

    public void Find(ArrayList<Service> serviceArrayList, String keyword) {
        boolean kt = false;
        for(Service service:serviceArrayList){
            if (service.getServicename().equalsIgnoreCase(keyword) || service.getServicecode().equalsIgnoreCase(keyword)) {
                show(service);
                kt = true;
            }
        }
        if (kt == false) System.out.println("Can not find service");
    }

    public void EditObjectService(ArrayList<Service> serviceArrayList, String keyword, Service service, InputObjectServices inputObjectServices) {
        boolean kt = false;
        for (int i = 0; i < serviceArrayList.size(); i++) {
            if (serviceArrayList.get(i).getServicename().toLowerCase().endsWith(keyword.toLowerCase()) || serviceArrayList.get(i).getServicecode().equalsIgnoreCase(keyword)) {
                System.out.println("Press 0 to skip");
                String name = inputObjectServices.inputSeviceName();
                if (name.equals("0")) name = serviceArrayList.get(i).getServicename();


                String code = inputObjectServices.inputServiceCode();
                if (code.equals("0")) code = serviceArrayList.get(i).getServicecode();


                int cost = inputObjectServices.inputCost();
                if (cost == 0) cost = serviceArrayList.get(i).getCost();

                kt = true;
                serviceArrayList.set(i,new Service(name,code,cost));
                System.out.println("Edit successful");
            }
        }
        if (kt == false) System.out.println("Can not find Service");
    }

    public void deleteService(ArrayList<Service> ServiceArrayList, String keyword) {
        boolean kt = false;
        for (int i = 0; i < ServiceArrayList.size(); i++) {
            if (ServiceArrayList.get(i).getServicename().toLowerCase().endsWith(keyword.toLowerCase()) || ServiceArrayList.get(i).getServicecode().equalsIgnoreCase(keyword)) {
                ServiceArrayList.remove(i);
                kt = true;
                System.out.println("Delete successful");
            }
        }
        if (kt == false) System.out.println("Can not find sevice");
    }

}
