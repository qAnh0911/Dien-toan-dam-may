package BaiThucHanhLab4.BaiThucHanhJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Map<Integer,Student> map = new HashMap<>();
        System.out.println("Nhap vao so phan tu");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            Student std = new Student();
            std.NHAPTHONGTIN();
            map.put(n,std);
        }

        System.out.println("Nhap vao ten lop can tim kiem:");
        String tamString = sc.nextLine();
        for(int j = 0 ; j < map.size();j++){
            if(tamString == map.get(j).Lop){
                map.get(j).XUATTHONGTIN();
            }
        }
        System.out.println("Nhap vao MSV can tim kiem:");
        int tamint = sc.nextInt();
        for(int j = 0 ; j < map.size();j++){
            if(tamint == map.get(j).MSV){
                map.get(j).XUATTHONGTIN();
                break;
            }
        }
    }
    
}