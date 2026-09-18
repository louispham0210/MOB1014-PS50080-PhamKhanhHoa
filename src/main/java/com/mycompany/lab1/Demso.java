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
public class Demso {
     private static final String[] CHU_SO = {"không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};

    // Hàm đọc cụm 3 chữ số
    private static String docCucBaSo(int so, boolean docDayDu) {
        int tram = so / 100;
        int chuc = (so % 100) / 10;
        int donVi = so % 10;
        StringBuilder chu = new StringBuilder();

        // Xử lý hàng trăm
        if (docDayDu || tram > 0) {
            chu.append(CHU_SO[tram]).append(" trăm ");
        }

        // Xử lý hàng chục
        if (chuc > 1) {
            chu.append(CHU_SO[chuc]).append(" mươi ");
        } else if (chuc == 1) {
            chu.append("mười ");
        } else if (chuc == 0 && donVi > 0 && (docDayDu || tram > 0)) {
            chu.append("lẻ ");
        }

        // Xử lý hàng đơn vị
        if (donVi > 0) {
            if (chuc > 1 && donVi == 1) {
                chu.append("mốt");
            } else if (chuc > 0 && donVi == 5) {
                chu.append("lăm");
            } else if (chuc > 1 && donVi == 4) {
                chu.append("tư"); // 24 -> hai mươi tư
            } else {
                chu.append(CHU_SO[donVi]);
            }
        }

        return chu.toString().trim();
    }

    // Hàm chính chuyển số tiền thành chữ
    public static String doiSoTienThanhChu(long soTien) {
        if (soTien == 0) {
            return "Không đồng";
        }

        String[] donViTien = {"", "nghìn", "triệu", "tỷ", "nghìn tỷ", "triệu tỷ"};
        StringBuilder ketQua = new StringBuilder();
        int i = 0;
        long phanConLai = soTien;

        while (phanConLai > 0) {
            int cumBaSo = (int) (phanConLai % 1000);
            
            if (cumBaSo > 0) {
                // Xác định xem có cần đọc "không trăm" ở phía trước không
                boolean canDocDayDu = (soTien > 1000) && (phanConLai != soTien);
                String chuCum = docCucBaSo(cumBaSo, canDocDayDu);
                
                // Nối vào đầu chuỗi kết quả
                ketQua.insert(0, chuCum + " " + donViTien[i] + " ");
            }
            
            phanConLai /= 1000;
            i++;
        }

        // Dọn dẹp khoảng trắng dư thừa và thêm "đồng"
        String text = ketQua.toString().replaceAll("\\s+", " ").trim() + " đồng";
        
        // Viết hoa chữ cái đầu tiên
        return text.substring(0, 1).toUpperCase() + text.substring(1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền (VND): ");
        long soTien = scanner.nextLong();

        System.out.println("--------------------------------");
        System.out.println("Bằng chữ: " + doiSoTienThanhChu(soTien));
        
        scanner.close();
    }
}
