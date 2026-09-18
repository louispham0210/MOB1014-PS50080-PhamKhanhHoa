/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;
import java.util.Scanner;
/**
 *
 * @author Hello
 */
public class hinhtron {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập bán kính
        System.out.print("nhap ban kinh hinh tron: ");
        double banKinh = scanner.nextDouble();

        // Tính chu vi
        double chuVi = 2 * Math.PI * banKinh;

        // In ra bán kính và chu vi
        System.out.println("--------------------------------");
        System.out.printf("ban kinh hinh tron: %.2f\n", banKinh);
        System.out.printf("chu vi hinh tron: %.2f\n", chuVi);

        scanner.close();
    }
}
