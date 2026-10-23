/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;

/**
 *
 * @author khanh
 */
public class HinhTronDemo {
  public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(2.5, "Do");
        
        System.out.println(c1);
        System.out.println(c2);
        c2.setRadius(-3);
        System.out.println(c2);
    }
}
