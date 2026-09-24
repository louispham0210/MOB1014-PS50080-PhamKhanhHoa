/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2;
import java.util.Scanner;
/**
 *
 * @author Hello
 */
public class SinhVien {
   public String mssv;
   public String hoTenSV;
   public boolean gioiTinh;
   public Double diemT;
   public Double diemL;
   public Double diemH;
    
   public SinhVien(){
}
   public SinhVien (String mssv, String hoTenSV, boolean gioiTinh, Double diemT, Double diemL, Double diemH){
   this.mssv = mssv;
   this.hoTenSV = hoTenSV;
   this.gioiTinh = gioiTinh;
   this.diemT = diemT;
   this.diemL = diemL;
   this.diemH = diemH;
}
   void Nhap(){
       Scanner sc = new Scanner(System.in);
       System.out.print("Nhap MSSV: ");
       this.mssv = sc.nextLine();
       System.out.print("Nhap Ho Va Ten SV: ");
       this.hoTenSV = sc.nextLine();
       System.out.print("Gioi Tinh: ");
       this.gioiTinh = sc.nextBoolean();
       System.out.print("Nhap Diem Toan: ");
       this.diemT = sc.nextDouble();
       System.out.print("Nhap Diem Ly: ");
       this.diemL = sc.nextDouble();
       System.out.print("Nhap Diem Hoa: ");
       this.diemH = sc.nextDouble();
   }
   void Xuat(){
       System.out.println("Thong tin Sinh Vien");
       System.out.println(this.toString());
   }
   public Double DiemTB(){
    if(this.diemH != null && this.diemL != null && this.diemT != null)
      return (this.diemH + this.diemL + this.diemT)/3;
        else
       return null;
   }
   public String Xeploai(){
       if(this.DiemTB() >= 8.5)
           return "Gioi";
       else if(this.DiemTB() >= 6.5)
           return "Kha";
       else if(this.DiemTB() >= 5.0)
           return "Trung Binh";
       else
       return "Yeu";
   }
   
   }



