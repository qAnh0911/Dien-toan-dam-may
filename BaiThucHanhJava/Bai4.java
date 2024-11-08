package BaiThucHanhLab4.BaiThucHanhJava;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        HashSet<String> hashset = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        boolean check;
        do{
            System.out.println("Nhap vao ten trai cay:");
            String tempString = sc.nextLine();
            hashset.add(tempString);
            System.out.println("ban co muon nhap tiep khong\n1:co\n2:khong");
            int tempint = sc.nextInt();
            if(tempint == 1) check = true;
            else check = false;
        }while(check);

        System.out.printf("So phan tu cua hashset la %d",hashset.size());

        System.out.println("nhap ten loai trai cay can kiem tra:");
        String temString1 = sc.nextLine();
        if(hashset.contains(temString1)){
            System.out.println("co loai trai cay can tim trong danh sach");
        } else {
            System.out.println("khong co loai trai cay can tim");
        }

        hashset.clear();

        List<String> list = new LinkedList<>();
        list.add("lemon");
        list.add("water melon");
        hashset.addAll(list);
        Iterator<String> i =hashset.iterator();
        System.out.println("cac phan tu cua hash set la");
        while(i.hasNext()){
            System.out.println(i.next() + " ");
        }
        for(int j =0 ; j< list.size();j++){
              if(hashset.contains(list.get(j))){
                hashset.remove(list.get(j));
              }
        }
        System.out.println("cac phan tu cua hash set la");
        while(i.hasNext()){
            System.out.println(i.next() + " ");
        }
    }
}