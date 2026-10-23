/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author khanh
 */
public class QuanLyHinhTru {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Cylinder> list = new ArrayList<>();
        String timMau;
        boolean timThay = false;
        
        list.add(new Cylinder(1.0, "Do", 2.0));
        list.add(new Cylinder(2.0, "Xanh", 3.0));
        list.add(new Cylinder(1.5, "Vang", 4.0));
        list.add(new Cylinder(3.0, "Do", 1.0));
        list.add(new Cylinder(2.5, "Xanh", 2.0));
        
        System.out.print("Nhap mau: ");
        timMau = sc.nextLine();
        
        System.out.println("=== DANH SACH HINH TRU ===");
        for (Cylinder cylinder : list) {
            System.out.println(cylinder);
        }
        
        double tongTheTich = 0.0;
        for (Cylinder cylinder : list) {
            tongTheTich += cylinder.getVolume();
        }
        System.out.printf("Tong the tich: %.2f\n", tongTheTich);
        
        Cylinder maxVolume = list.get(0);
        for (Cylinder cylinder : list) {
            if (cylinder.getVolume() > maxVolume.getVolume())
                maxVolume = cylinder;
        }
        System.out.println("Hinh tru co the tich lon nhat:");
        System.out.println(maxVolume);
        
        System.out.printf("=== HINH TRU MAU %s ===\n", timMau);
        for (Cylinder cylinder : list) {
            if (cylinder.getColor().toLowerCase().equals(timMau.toLowerCase())) {
                System.out.println(cylinder);
                timThay = true;
            }
        }
        if (!timThay)
            System.out.printf("Khong co hinh tru mau %s", timMau);
    }
}
