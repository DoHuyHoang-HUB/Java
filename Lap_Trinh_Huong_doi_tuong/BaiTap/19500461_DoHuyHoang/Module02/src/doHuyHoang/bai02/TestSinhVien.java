package doHuyHoang.bai02;

import java.util.Scanner;

public class TestSinhVien {

	public static void main(String[] args) {
		try {
			Scanner nhap = new Scanner(System.in);
			Scanner sc = new Scanner(System.in);
			System.out.print("Nhap ma sinh vien 3: ");
			int maSinhVien = nhap.nextInt();
			
			System.out.print("Nhap ho ten 3: ");
			String hoTen = nhap.next();
			
			System.out.print("Nhap diem ly thuyet 3: ");
			float diemTH = sc.nextFloat();
			
			System.out.print("Nhap diem thuc hanh 3: ");
			float diemLT = sc.nextFloat();
			nhap.close();
			sc.close();
			SinhVien SV1 = new SinhVien(19496411, "Do Huy Hoang", 10, 9);
			SinhVien SV2 = new SinhVien();
			SinhVien SV3 = new SinhVien(maSinhVien, hoTen, diemLT, diemTH);
			System.out.printf("%-10s%-20s%-10s%-10s%-10s\n", "masv", "hoten", "diemlt", "diemth", "diemtb");
			System.out.println(SV1);
			System.out.println(SV2);
			System.out.println(SV3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
