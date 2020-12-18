package phan03;
/**
 * 14.   Viết chương trình xuất ra tổng các số là bội số của 7 (từ 1 đến 100).
 * @author DoHuyHoang
 *
 */
public class Bai14 {

	public static void main(String[] args) {
		int tong = 0;
		for(int i = 1; i <= 100; i++)
			if(i % 7 == 0) {
				System.out.printf("%d\n", i);
				tong += i;
			}
		System.out.println("Tong cac boi so cua 7 (tu 1 den 100) la: "+ tong);

	}

}
