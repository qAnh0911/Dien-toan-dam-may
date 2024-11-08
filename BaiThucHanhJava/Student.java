package BaiThucHanhLab4.BaiThucHanhJava;

import java.util.Scanner;

public class Student {
    int MSV;
    String HoVaTen,Lop;
    public void NHAPTHONGTIN() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masinhvien:");
        this.MSV = sc.nextInt();
        System.out.println("HoVaTen:");
        this.HoVaTen = sc.nextLine();
        System.out.println("Lop:");
        this.Lop = sc.nextLine();
    }
     public void XUATTHONGTIN() {
        System.out.printf("HO VA TEN:%s\nMSV:%d\nLOP:%s",this.HoVaTen,this.MSV,this.Lop);
     }
}