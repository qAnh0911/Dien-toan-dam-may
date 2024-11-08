package BaiThucHanhLab4.BaiThucHanhJava;

import java.util.LinkedList;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        System.out.println("Nhap vao so phan tu cua LinkedList:");
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0 ; i < temp; i++){
            Boolean a = true;
            do{
                int abc;
                System.out.println("Nhap vao phan tu thu "+ i);
                abc = sc.nextInt();
                if(abc > 0){
                    list.add(abc);
                    a = false;
                }
            }while(a);
        }

        int sum= 0, count = 0;

        for(int i = 0 ; i < temp;i++){
            if(list.get(i) % 2 ==0){
                sum += list.get(i);
                count++;
            }
        }
        float tbc = (float)sum/count;
        System.out.println("trung binh cong cua cac so trong list la " + tbc);
    }
}
