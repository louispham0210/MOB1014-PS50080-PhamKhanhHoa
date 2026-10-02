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
public class NhapSoHopLe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int so;
        int dem = 0;
        do {
            System.out.print("Nhap so: ");
            so = sc.nextInt();
            dem++;
            if (!(so > 0 && so % 3 == 0 && so % 5 == 0)) {
                System.out.println("So khong hop le, moi nhap lai!");
            }
        } while (so <= 0 || so % 3 != 0 || so % 5 != 0);
        System.out.println("So hop le: " + so + " (sau " + dem + " lan nhap)");
    }
}
