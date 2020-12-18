/**
 * 
 */
package doHuyHoang.bai05;

import java.time.LocalDate;

/**
 * @author Do-Huy-Hoang
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DanhSachHoaDonCuaKhachHang list = new DanhSachHoaDonCuaKhachHang();
		
		list.them(new KhachHangVN("01", "Do Huy Hoang", LocalDate.of(2018, 9, 13), 20, 20000, "Sinh hoạt", 15));
		list.them(new KhachHangNuocNgoai("02", "Nguyen Hung", LocalDate.of(2018, 8, 20), 100, 50000, "Trung Quốc"));
		list.them(new KhachHangVN("03", "Nguyen Truong Chinh", LocalDate.of(2017, 2, 15), 200, 100000, "San xuat", 160));
		
		System.out.println("Xuat danh sach khach hang VN\n" + list.xuatKHVN());
		System.out.println("Xuat danh sach khach hang nuoc ngoai\n" + list.xuatKHNuocNgoai());
		
		System.out.println("Tong so luong khach hang VN: " + list.TongSLKhachHangVN());
		System.out.println("Tong so luong khach hang nuoc ngoai: " + list.tongSLKHNuocNgoai());
		
		System.out.println("Tính trung binh thanh tien cua khach hang nuoc ngoai: " + list.TBThanhTienKHNuocNgoai());
		
		System.out.println("Xuat cac hoa don trong thang 09 nam 2018\n" + list.xuatHoaDon());
	}
}
