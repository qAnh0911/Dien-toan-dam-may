package BaiThucHanhLab4.BaiThucHanhJava;

import java.util.LinkedList;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        LinkedList<SINHVIEN> list =  new LinkedList<>();
    Boolean check = true;

    do {
        check = true;
        SINHVIEN a = new SINHVIEN();
        a.NhapThongTin();
        if(a.getName()== ""){
            check = false;
        }
    }while(check);
    int count = 0;
    for( int i = 0 ; i < list.size();i++){
        if(list.get(i).getDiem() <= 5){
            list.get(i).inThongTin();
            count++;
        }
    }
    System.out.printf("Co %d Sinh vien phai thi lai",count);
    float Maxpoint = 0;

    for( int i = 0 ; i < list.size();i++){
        if(list.get(i).getDiem() > Maxpoint){
            Maxpoint = list.get(i).getDiem();
        }
    }
    for( int i = 0 ; i < list.size();i++){
        if(list.get(i).getDiem() == Maxpoint){
            list.get(i).inThongTin();
        }
    }

    System.out.println("Nhap Ten SInh Vien Can Tim Kiem:");
    Scanner sc = new Scanner( System.in);
    String tempString = sc.nextLine();
    for( int i = 0 ; i < list.size();i++){
        list.get(i).SearchByName(tempString);
    }

    }
    
}