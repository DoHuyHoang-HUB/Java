/**
 * 
 */
package doHuyHoang.bai06;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * @author Do-Huy-Hoang
 *
 */
public class Test {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		try {
			DachSachHoaDon list = new DachSachHoaDon();
			Scanner nhap = new Scanner(System.in);
			int key;
			do {
				System.out.println("1. Nhap danh hoa don.");
				System.out.println("2. Xuat danh sach hoa don.");
				System.out.println("3. Tong so luong hoa don theo gio.");
				System.out.println("4. Tong so luong hoa don theo ngay.");
				System.out.println("5. Tinh tong thanh tien cua hoa don theo thang nam.");
				System.out.println("6. Thoat.");
				System.out.print("Nhap lua chon cua ban: ");
				key = nhap.nextInt();
				switch (key) {
				case 1:{
					list.them(new HoaDonTheoGio("01", LocalDate.of(2020, 9, 12), "Do Huy Hoang", "A1", 500000, 2));
					list.them(new HoaDonTheoNgay("02", LocalDate.of(2020, 7, 18), "Nguyen Van A", "A2", 200000, 5));
					list.them(new HoaDonTheoGio("03", LocalDate.of(2020, 4, 20), "Le Thi B", "B2", 100000, 26));
					list.them(new HoaDonTheoNgay("04", LocalDate.of(2020, 2, 12), "Pham Thi C", "C4", 250000, 10));
				}
					break;
				case 2: System.out.println(list);
					break;
				case 3: System.out.println(list.thongKeSoLuongHoaDonTheoGio());
					break;
				case 4: System.out.println(list.thongKeSoLuongHoaDonTheoNgay());
					break;
				case 5: System.out.println(list.tinhTongThanhTien(9, 2020));
					break;
				case 6: System.exit(0);
				default: System.out.println("Nhap sai!");
					break;
				}
			} while (key != 6);
			nhap.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
