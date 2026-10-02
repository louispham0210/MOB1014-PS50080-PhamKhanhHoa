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
public class XuLyMang {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap so phan tu n: ");
            n = sc.nextInt();
        } while (n <= 0);
        int[] a = new int[n];
        System.out.println("Nhap cac phan tu cho mang:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Mang vua nhap: ");
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.print("Cac phan tu chan: ");
        boolean coSoChan = false;
        for (int x : a) {
            if (x % 2 != 0) {
                continue;
            }
            System.out.print(x + " ");
            coSoChan = true;
        }
        if (!coSoChan) {
            System.out.print("Khong co phan tu chan");
        }
        System.out.println();
        int tong4 = 0;
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 4 == 0) {
                tong4 += a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Tong cac so chia het cho 4: " + tong4);
        System.out.println("Gia tri lon nhat: " + max);
    }   
}
