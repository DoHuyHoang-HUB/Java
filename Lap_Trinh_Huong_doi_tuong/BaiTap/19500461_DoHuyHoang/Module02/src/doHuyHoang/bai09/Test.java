package doHuyHoang.bai09;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		KhachHang kh = new KhachHang("KH001", "Nguyen Van A", 5);
		kh.themSoTietKiem(new SoTietKiem("STK111", LocalDate.of(2020, 02, 26), 1000000, 3, 0.005, 6));
		kh.themSoTietKiem(new SoTietKiem("STK112", LocalDate.of(2020, 02, 26), 10000000, 6, 0.006, 6));
        System.out.println(kh);                                                                                                                                                                                                            
	}

}
