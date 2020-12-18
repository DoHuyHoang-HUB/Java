package phan03;
/**
 * 8.   Tính tổng N số nguyên tố đầu tiên.
 * @author DoHuyHoang
 */
import java.util.Scanner;

public class Bai08 {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = nhap.nextInt();
		nhap.close();
		int sum = 0;
		for(int i = 2; i <= n; i++)
			if(kTSoNguyenTo(i) == true) {
				System.out.printf("%5d", i);
				sum = sum + i;
			}
		System.out.println("\nTong n so nguyen to dau tien la: " + sum);

	}
	public static boolean kTSoNguyenTo(int n) {
		int dem = 0;
		if(n < 2)
			return false;
		for(int i = 2; i < 100; i++)
			if(n % i == 0)
				dem += 1;
		if(dem == 1)
			return true;
		else
			return false;
	}

}
