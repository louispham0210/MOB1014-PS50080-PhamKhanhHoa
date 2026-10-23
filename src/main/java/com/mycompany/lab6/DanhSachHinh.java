/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author khanh
 */
public class DanhSachHinh {
public static void main(String[] args) {
        List<Circle> shapes = new ArrayList<>();
        int countCircle = 0;
        int countCylinder = 0;
        
        shapes.add(new Circle(1, "Do"));
        shapes.add(new Cylinder(1, "Do", 2));
        shapes.add(new Circle(2, "Trang"));
        shapes.add(new Cylinder(2, "Xanh", 3));
        
        for (Circle s : shapes) {
            System.out.print(s);
            System.out.printf(" -> %.2f\n", s.getArea());
        }
        
        for (Circle s : shapes) {
            if (s instanceof Cylinder){
                countCylinder++;
            }
            else
                countCircle++;
        }
        System.out.println("So hinh tron: " + countCircle);
        System.out.println("So hinh tru: " + countCylinder);
        
        double tongTheTich = 0.0;
        for (Circle s : shapes) {
            if (s instanceof Cylinder) {
                tongTheTich += ((Cylinder) s).getVolume();
            }
        }
        System.out.printf("Tong the tich cac hinh tru: %.2f", tongTheTich);
    }
}
