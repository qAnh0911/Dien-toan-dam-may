package BaiThucHanhLab4.BaiThucHanhJava;

import java.util.Scanner;

public class SINHVIEN {
    String Name;
    float DIEM;
    public String getName() {
        return this.Name;
    }
    public float getDiem(){
        return this.DIEM;
    }
    public void NhapThongTin() {
        Scanner sc = new Scanner( System.in);
        System.out.println("Nhap Ten Sinh Vien:");
        this.Name = sc.nextLine();
        System.out.println("Nhap Diem:");
        this.DIEM = sc.nextFloat();
    }

public void inThongTin() {
    System.out.printf("Ten Sinh Vien: %s\nDiem: %f",this.Name,this.DIEM);
}

    public void SearchByName(String a) {
        if(this.Name == a){
            System.out.printf("Ten Sinh Vien: %s\nDiem: %f",this.Name,this.DIEM);
        }
    }
}
