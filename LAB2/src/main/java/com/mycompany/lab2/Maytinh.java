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
public class Maytinh {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, ketQua = 0;
        char op;       
        System.out.print("Nhap vao so a: ");
        a = sc.nextDouble();
        System.out.print("Nhap vao so b: ");
        b = sc.nextDouble();
        System.out.print("Nhap vao phep toan: ");
        op = sc.next().charAt(0);
        switch (op) {
            case '+':
                ketQua = a + b;
                break;
            case '-':
                ketQua = a - b;
                break;
            case '*':
                ketQua = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Khong the chia cho 0");
                    return;
                }
                else {
                    ketQua = a / b;
                    break;
                }
            default:
                System.out.println("Phep toan khong hop le!");
        }
        System.out.printf("%.2f %c %.2f = %.2f", a, op, b, ketQua);
    }
}
