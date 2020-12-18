package doHuyHoang.bai05;

import java.time.LocalDate;

public class TestHangThucPham {

	public static void main(String[] args) {
			HangThucPham h1 = new HangThucPham("001","Gao",100000, LocalDate.of(2018, 07, 10),
					LocalDate.of(2021, 07, 10));

			HangThucPham h2 = new HangThucPham("002","Mi", 5000, LocalDate.of(2018, 03, 01),
					LocalDate.of(2020,10,23));
			HangThucPham h3 = new HangThucPham("003","Nước", 10000, LocalDate.of(2017, 03, 01),
					LocalDate.of(2018, 03, 01));
			System.out.printf("%10s %15s %20s %25s %25s %20s", "Ma hang", "Ten Hang", "Don gia", "Ngay san xuat",
					"Ngay het han","Ghi chu");
			System.out.printf("\n%s", h1.toString());
			System.out.printf("\n%s", h2.toString());
			System.out.printf("\n%s", h3.toString());
	}
}