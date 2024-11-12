package BaiThucHanhLab4.BaiThucHanhJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        System.out.println("Nhap vao so phan tu cua Arraylist:");
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>(temp);

        System.out.println("Nhap Du Lieu");
        for(int i = 0 ; i < temp ; i++){
            int abc;
            System.out.println("Nhap vao phan tu thu "+ i);
            abc = sc.nextInt();
            arr.add(abc);
        }

        System.out.println("Nhap vao phan tu can xoa ");
        int temp1 = sc.nextInt();
        for(int i = 0 ; i < arr.size() ; i++){
            if(arr.get(i)== temp1){
                arr.remove(i);
            }
        }
        Collections.sort(arr);
        System.out.println(arr);
    }
}
đang test bài mới
