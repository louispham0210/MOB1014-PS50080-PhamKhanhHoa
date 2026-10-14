/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

import java.util.Scanner;

/**
 *
 * @author khanh
 */
public class QuanLySV {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap so luong sinh vien: ");
            n = sc.nextInt();
            if (n <= 0)
                System.out.println("So luong sinh vien khong hop le, xin moi nhap lai.");
        }while(n <= 0);
        sc.nextLine();
        Student[] ds = new Student[n];
        for (int i = 0; i < n; i++) {
            ds[i] = new Student();
            ds[i].input(sc);
        }
        System.out.println("=== DANH SACH SINH VIEN ===");
        for (Student d : ds) {
            d.output();
        }
        
        Student sMaxGPA = ds[0];
        System.out.println("=== SINH VIEN CO GPA CAO NHAT ===");
        for (Student d : ds) {
            if (d.getGpa() > sMaxGPA.getGpa())
                sMaxGPA = d;
        }
        sMaxGPA.output();
        
        System.out.println("=== DANH SACH SAU KHI SAP XEP GIAM DAN THEO GPA ===");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (ds[j].getGpa() < ds[j+1].getGpa()) {
                    Student temp = ds[j];
                    ds[j] = ds[j+1];
                    ds[j+1] = temp;
                }
            }
        }
        for (Student d : ds) {
            d.output();
        }
    }
}
