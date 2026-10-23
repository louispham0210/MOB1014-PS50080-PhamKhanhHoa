/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;

/**
 *
 * @author khanh
 */
public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0)
            System.out.println("Chieu cao khong hop le");
        else
            this.height = height;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * radius * height + 2 * super.getArea(); 
    }
    
    public double getVolume() {
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return String.format("Hinh tru [ban kinh = %.2f, mau=%s, chieu cao=%.2f, dien tich toan phan=%.2f, the tich=%.2f", radius, color, height, getArea(), getVolume());
    } 
}
