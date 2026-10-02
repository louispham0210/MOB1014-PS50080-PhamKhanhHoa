/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;
import java.util.Scanner;
/**
 *
 * @author Hello
 */
public class TrungBinhChia3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("n phai la so nguyen duong");
            return;
        }
        int tong = 0;
        int dem = 0;
        String danhSach = "";
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                danhSach += i + " ";
                tong += i;
                dem++;
            }
        }
        if (dem == 0) {
            System.out.println("Khong co so nao chia het cho 3");
        } else {
            double trungBinh = (double) tong / dem;
            System.out.println("Cac so chia het cho 3: " + danhSach.trim());
            System.out.println("Tong: " + tong);
            System.out.printf("Trung binh cong: %.2f\n", trungBinh);
        }
    }
}
