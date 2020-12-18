/**
 * 
 */
package doHuyHoang.bai03;

import java.text.DecimalFormat;
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
		DanhSachGiaoDich list = new DanhSachGiaoDich();
		
		list.them(new GiaoDichVang("01", LocalDate.of(2020, 3, 11), 100000, 5, "Vang 24k"));
		list.them(new GiaoDichTienTe("02", LocalDate.of(2020, 6, 16), 500000, 10, 23000, "USD"));
		list.them(new GiaoDichTienTe("03", LocalDate.of(2019, 5, 11), 5000000, 2, 18000, "Euro"));
		list.them(new GiaoDichVang("04", LocalDate.of(2020, 3, 11), 100000, 10, "Vang ma"));
		list.them(new GiaoDichTienTe("05", LocalDate.of(2020, 3, 11), 20000000, 20, 2000, "VND"));
		
		System.out.println("Xuat giao dich vang");
		System.out.println(list.xuatGDVang());
		
		System.out.println("Xuat giao dich tien te");
		System.out.println(list.xuatGDTienTe());
		
		System.out.print("Tong so luong giao dich vang: ");
		System.out.println(list.tinhTongSoLuongGDVang());
		
		System.out.print("Tong so luong giao dich tien te: ");
		System.out.println(list.tinhTongSoLuongGDTienTe());
		
		DecimalFormat dFormat = new DecimalFormat("#,##0");
		System.out.print("Trung binh thanh tien cua giao dich tien te: ");
		System.out.println(dFormat.format(list.tinhTrungBinhCongThanhTienCuaGDTienTe()));
		
		System.out.println("Xuat ra cac giao dich co don gia > 1 ty");
		System.out.println(list.xuatDonGiaLonHon1ty());
	}

}
