package phan03;
/**
 * 12.   Viết chương trình in ra tổng của 10 số chẵn đầu tiên.
 * @author DoHuyHoang
 *
 */

public class Bai12 {

	public static void main(String[] args) {
		int tongchan = 0;
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 0) {
				System.out.printf("%5d", i);
				tongchan += i;
			}
		}
		System.out.println("\nTong cua 10 so chan dau tien la: "+ tongchan);

	}
}