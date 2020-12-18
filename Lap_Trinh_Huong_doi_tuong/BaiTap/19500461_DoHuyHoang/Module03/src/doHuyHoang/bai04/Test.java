/**
 * 
 */
package doHuyHoang.bai04;

import java.time.LocalDate;

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
		// TODO Auto-generated method stub
		try {
			DanhSachGiaoDichNhaDat list = new DanhSachGiaoDichNhaDat();
			
			list.them(new GiaoDichDat("01", LocalDate.of(2013, 9, 23), 100000, "A", 10));
			list.them(new GiaoDichNha("02", LocalDate.of(2013, 9, 23), 10000, 25, "Thuong", "Tp.Ho Chi Minh"));
			list.them(new GiaoDichDat("03", LocalDate.of(2014, 10, 13), 550000, "B", 15));
			list.them(new GiaoDichNha("04", LocalDate.of(2013, 10, 20), 600000, 30, "Cao cap", "Vung tau"));
			list.them(new GiaoDichNha("05", LocalDate.of(2012, 9, 16), 40000, 15, "Cao cap", "Tp.Ho Chi Minh"));
			
			System.out.println("Tinh tong so luong cho giao dich nha: " + list.tinhTongSoLuongGDNha());
			System.out.println("Tinh tong so luong cho giao dich dat: " + list.tinhTongSoLuongGDDat());
			
			System.out.println("Tinh trung binh thanh tien cua giao dich dat: " + list.tinhTrungBinhCongThanhTienCuaGDDat());
			
			System.out.println("Xuat cac giao dich cua thang 9 nam 2013\n" + list.XuatGD());
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
