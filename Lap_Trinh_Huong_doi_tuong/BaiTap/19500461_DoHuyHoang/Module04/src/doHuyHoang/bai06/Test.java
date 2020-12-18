/**
 * 
 */
package doHuyHoang.bai06;

/**
 * @author Do-Huy-Hoang
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DanhSachPhongHoc list = new DanhSachPhongHoc();
		list.them(new PhongHocLyThuyet("01", "A3", 20, 2, true));
		list.them(new PhongMayTinh("02", "E4", 30, 2, 10));
		list.them(new PhongThiNghiem("03", "H2", 20, 2, "Cong nghe hoa", 10, true));
		list.them(new PhongHocLyThuyet("04", "A5", 40, 2, false));
		list.them(new PhongMayTinh("05", "H9", 20, 1, 60));
		list.them(new PhongThiNghiem("06", "X10", 40, 4, "Dien tu", 20, false));
		
		System.out.println(list);
		System.out.println("Tim kiem danh sach: \n" + list.timKien("02"));
		System.out.println("Phong hoc dat chuan: \n" + list.phongHocDatChuan());
		list.sapXepTangDanTheoDayNha();
		System.out.println(list);
		list.sapXepGiamDanTheoDienTich();
		System.out.println(list);
		list.sapXepTangDanTheoSoBongDen();
		System.out.println(list);
		if(list.capNhat("02", 60) == true)
			System.out.println("Cap nhat thanh cong");
		else {
			System.out.println("Khong tim thay ma");
		}
		System.out.println(list);
		list.xoaTheoMa("03");
		System.out.println(list);
		System.out.println("Tong so phong hoc: " + list.tinhTongSoPhongHoc());
		System.out.println(list.phongMayCo60May());
	}

}
