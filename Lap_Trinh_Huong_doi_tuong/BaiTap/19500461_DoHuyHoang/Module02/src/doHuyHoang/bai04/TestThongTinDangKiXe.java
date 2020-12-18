package doHuyHoang.bai04;

public class TestThongTinDangKiXe {

	public static void main(String[] args) throws Exception {
		try {
			ThongTinDangKiXe arr[] = new ThongTinDangKiXe[3];
			arr[0] = new ThongTinDangKiXe("Nguyen Thi Thu Loan", "Future Neo", 100, 35000000);
			arr[1] = new ThongTinDangKiXe("Le Minh Tinh", "Ford Ranger", 3000, 250000000);
			arr[2] = new ThongTinDangKiXe("Nguyen Minh Tri", "Landscape", 1500, 1000000000);
			System.out.println(ThongTinDangKiXe.e());
			for (ThongTinDangKiXe thongTinDangKiXe : arr) {
				System.out.print(thongTinDangKiXe);
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
