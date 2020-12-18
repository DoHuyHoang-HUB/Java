package phan03;
/**
 * 7.   Tính tổng các số nguyên tố nhỏ hơn N.
 * @author DoHuyHoang
 */
import java.util.Scanner;
public class Bai07 {
	private static Scanner nhap = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Nhap n: ");
		int n = nhap.nextInt();
		nhap.close();
		if(n > 2) {
			int result = tinhTongSoNguyenTo(n);
			System.out.printf("Tong cac so nguye nto nho hon %d la: %d", n, result);
		}	
		

	}
	static boolean soNguyenTo(int n) {
		for(int i = 2; i < n; i++)
			if(n % i == 0)
				return false;
		return true;

}
	public static int tinhTongSoNguyenTo(int n){
		int sum = 0;
		for(int i = 2; i < n; i++)
			if(soNguyenTo(i) == true)
				sum += i;
		return sum;
	}
}
