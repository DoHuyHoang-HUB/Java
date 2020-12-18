/**
 * 
 */
package doHuyHoang.bai08;

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
		try {
			DanhSachHangHoa list = new DanhSachHangHoa();
			list.them(new HangThucPham("01", "Gao", 80000, 10, "A", LocalDate.of(2019, 5, 12), LocalDate.of(2020, 5, 12)));
			list.them(new HangDienMay("02", "May giat", 1000000, 2, 30, 5));
			list.them(new HangSanhSu("03", "Binh hoa", 50000, 10, LocalDate.of(2018, 2, 14), LocalDate.of(2020, 11, 23)));
			list.sapXepTangDanTheoTen();
			System.out.println(list);
			
			System.out.println(list.hangThucPham());
			
			System.out.println(list.hangDienMay());
			
			System.out.println(list.hangSanhSu());
			

			System.out.println("Tim kiem: " + list.timKien("01"));
			list.xoaTheoMa("01");
			System.out.println(list);
			list.suaThongTinHangHoa("03", 100000);
			System.out.println(list);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
