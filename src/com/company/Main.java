package com.company;

import com.company.object.Doctor;
import com.company.object.Patient;
import com.company.object.Service;
import com.company.process.ProcessObjectDoctor;
import com.company.process.ProcessObjectPatient;
import com.company.process.ProcessObjectService;
import com.company.readandwrite.ReadAndWrite;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void MenuClient(Doctor doctor, Patient patient, Service service, ProcessObjectDoctor processObjectDoctor, ProcessObjectPatient processObjectPatient, ProcessObjectService processObjectService, ReadAndWrite readAndWrite){
        System.out.println("__________________________________________________________");
        System.out.println("|        CHƯƠNG TRÌNH QUẢN LÍ Y TẾ BỆNH VIỆN             |");
        System.out.println("|________________________________________________________|");
        System.out.println("|               1.Quản lí bệnh nhân                      |");
        System.out.println("|               2.Quản lí bác sĩ                         |");
        System.out.println("|               3.Quản lí dịch vụ                        |");
        System.out.println("|               5.Trở về                                 |");
        System.out.println("|________________________________________________________|");
    }
    static void Menu1(){
        System.out.println("+--------------------------------------------------------+");
        System.out.println("|         CHƯƠNG TRÌNH QUẢN LÍ Y TẾ BỆNH VIỆN            |");
        System.out.println("+--------------------------------------------------------+");
        System.out.println("|               1.Quản lí bệnh nhân                      |");
        System.out.println("+--------------------------------------------------------+");
        System.out.println("|               2.Quản lí bác sĩ                         |");
        System.out.println("+--------------------------------------------------------+");
        System.out.println("|               3.Quản lí dịch vụ                        |");
        System.out.println("+--------------------------------------------------------+");
        System.out.println("|               4.Trở về                                 |");
        System.out.println("+--------------------------------------------------------+");
    }
    static void Menubenhnhan(){
        System.out.println("+--------------------------------------------------------+");
        System.out.println("|                    QUẢN LÝ BỆNH NHÂN                   |");
        System.out.println("+--------------------------------------------------------+");
        System.out.println("|               1.Thêm bệnh nhân                         |");
        System.out.println("+--------------------------------------------------------+");
        System.out.println("|               2.Hiện thị danh sách bệnh nhân           |");
        System.out.println("+--------------------------------------------------------+");
        System.out.println("|               3.Tìm kiếm bệnh nhân                     |");
        System.out.println("+--------------------------------------------------------+");
        System.out.println("|               4.Sửa thông tin bệnh nhân                |");
        System.out.println("+--------------------------------------------------------+");
        System.out.println("|               5.Xóa thông tin bệnh nhân                |");
        System.out.println("+--------------------------------------------------------+");
        System.out.println("|               6.Sắp xếp theo tên                       |");
        System.out.println("+--------------------------------------------------------+");
        System.out.println("|               7.Trở về                                 |");
        System.out.println("+--------------------------------------------------------+");
    }
    static void Nhapthongtinbenhnhan(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("+--------------------------------------------------------+");
        System.out.println("|               Nhập thông tin bệnh nhân                 |");
        System.out.println("+--------------------------------------------------------+");
        System.out.print("Nhập tên       | ");
        String a = scanner.nextLine();
        System.out.println("|________________________________________________________|");
        System.out.print("Nhập giới tính | ");
        String b = scanner.nextLine();
        System.out.println("|________________________________________________________|");
        System.out.print("Nhập tuổi      | ");
        String c = scanner.nextLine();
        System.out.println("|________________________________________________________|");
        System.out.print("Nhập địa chỉ   | ");
        String d = scanner.nextLine();
        System.out.println("|________________________________________________________|");
        System.out.print("Nhập bệnh      | ");
        String e = scanner.nextLine();
        System.out.println("|________________________________________________________|");
        System.out.print("Nhập số BHYT   | ");
        String g = scanner.nextLine();
        System.out.println("|________________________________________________________|");
    }
    static void Hienbenhnhan(){
        System.out.println("+--------------------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.println("|                                                 HIỂN THỊ DANH SÁCH BỆNH NHÂN                                                                     |");
        System.out.println("+--------------------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.printf("|%20s|%20s|%20s|%20s|%20s|%20s|%20s|\n","ID","Họ và tên","Giới tính","Tuổi","Địa chỉ","Bệnh","Số BHYT");
        System.out.println("+--------------------|--------------------|--------------------|--------------------|--------------------|--------------------|--------------------+");
        System.out.printf("|%20s|%20s|%20s|%20s|%20s|%20s|%20s|\n","0","Đỗ Thành Tôn","nam","19","Văn Giang-Hưng Yên","viêm màng túi","16543134641");
        System.out.println("+--------------------|--------------------|--------------------|--------------------|--------------------|--------------------|--------------------+");
    }
    static void Timkiembenhnhan(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("+--------------------------------------------------------+");
        System.out.println("|               Nhập thông tin tìm kiếm                  |");
        System.out.println("+--------------------------------------------------------+");
        System.out.print("|Nhập thông tin cần tìm       | ");
        String a = scanner.nextLine();
        System.out.println("|________________________________________________________|");
    }
    public static void main(String[] args) {
        Timkiembenhnhan();
        Hienbenhnhan();

    }
}
