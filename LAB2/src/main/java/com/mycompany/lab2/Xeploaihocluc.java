/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;
import java.util.Scanner;
/**
 *
 * @author Hello
 */
public class Xeploaihocluc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double toan, ly, hoa, diemTB;
        String xepLoai = "";
        System.out.print("Nhap diem toan: ");
        toan = sc.nextDouble();
        System.out.print("Nhap diem ly: ");
        ly = sc.nextDouble();
        System.out.print("Nhap diem hoa: ");
        hoa = sc.nextDouble();
        
        if ((toan < 0 || toan > 10) || (ly < 0 || ly > 10) || (hoa < 0 || hoa > 10)) {
            System.out.println("Diem khong hop le");
            return;
        }
        else {
            diemTB = (toan * 2 + ly + hoa) / 4;
            if (diemTB >= 8.0)
                xepLoai = "Gioi";
            else if (diemTB >= 6.5)
                xepLoai = "Kha";
            else if (diemTB >= 5.0)
                xepLoai = "Trung binh";
            else 
                xepLoai = "Yeu";
        }       
        System.out.printf("Diem trung binh: %.2f \n", diemTB);
        System.out.printf("Xep loai: %s", xepLoai);
    }
}
