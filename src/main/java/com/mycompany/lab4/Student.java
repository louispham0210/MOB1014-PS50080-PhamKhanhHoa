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
public class Student {
    public String id;
    public String name;
    public int age;
    public double gpa;

    public Student() {
    }
    
    public Student(String id, String name, int age, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0)
            System.out.println("Tuoi khong hop le");
        else 
            this.age = age;
    }

    public void setGpa(double gpa) {
        if (gpa < 0 || gpa > 10)
            System.out.println("GPA khong hop le");
        else 
            this.gpa = gpa;
    }
    
    public void input(Scanner sc) {
        
        System.out.print("Nhap MSSV: ");
        this.id = sc.nextLine();
        
        System.out.print("Nhap ho ten: ");
        this.name = sc.nextLine();
        
        System.out.print("Nhap tuoi: ");
        this.age = sc.nextInt();
        
        System.out.print("Nhap diem trung binh: ");
        this.gpa = sc.nextDouble();
        sc.nextLine();
    }
    
    
    public void output() {
        System.out.println("ID: " + this.id + " | Ho ten: " + this.name + " | Tuoi: " + this.age + " | GPA: " + this.gpa + " | Xep loai: " + rank());
    }
    
    
    public String rank() {
        if (this.gpa >= 9.0)
            return "Excellent";
        else if (this.gpa >= 8.0)
            return "Very Good";
        else if (this.gpa >= 6.5)
            return "Good";
        else if (this.gpa >= 5.0)
            return "Average";
        else 
            return "Fail";
    }
}