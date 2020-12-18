package doHuyHoang.bai02;

import java.time.LocalDate;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		DanhSachSach listSach = new DanhSachSach();

		listSach.them(new SachGiaoKhoa("01", 35000, LocalDate.of(2020, 3, 19), 6, "kim dong", false));
		listSach.them(new SachThamKhao("02", 120000, LocalDate.of(2020, 6, 16), 3, "tre", 10000));
		listSach.them(new SachGiaoKhoa("03", 65000, LocalDate.of(2020, 3, 19), 2, "kim dong", true));
		listSach.them(new SachGiaoKhoa("04", 155000, LocalDate.of(2020, 4, 6), 6, "van hoc", true));
		listSach.them(new SachThamKhao("05", 135000, LocalDate.of(2019, 9, 11), 2, "tre", 15000));
		listSach.them(new SachGiaoKhoa("06", 20000, LocalDate.of(2020, 7, 23), 1, "van hoc", true));
		
		System.out.println("Xuat danh sach giao khoa");
		System.out.println(listSach.xuatSGK());
		
		System.out.println("Xuat danh sach tham khao");
		System.out.println(listSach.xuatSTK());
		
		System.out.println("Tong so thanh tien sach giao khoa: " + listSach.tinhTongThanhTienSGK());
		System.out.println("Tong so thanh tien sach tham khao: " + listSach.tinhTongThanhTienSTK());
		
		System.out.println("Tinh trung binh cong don gia cua sach tham khao: " + listSach.tinhTrungBinhCongDonGiaSTK());
		
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap nha xuat ban: ");
		String NXB = input.nextLine();
		System.out.println("Xuat ra cac sach giao khoa cua nha xuat ban " + NXB + "\n" + listSach.xuatDSSachNhaXuatBanK(NXB));
		input.close();
		
	}
}
