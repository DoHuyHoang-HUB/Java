package phan03;
/**
 * 5.   Viết chương trình tìm USCLN của 2 số nhập vào.
 * @author DoHuyHoang
 */
import java.util.Scanner;

public class Bai05 {
	private static Scanner nhap = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Nhap so nguyen duong a: ");
		int a = nhap.nextInt();
		System.out.print("Nhap so nguyen duong b: ");
		int b = nhap.nextInt();
		System.out.println("USCLN cua "+ a +" va "+ b +" la "+ USCLN(a, b));

	}
	public static int USCLN(int a, int b) {
		if(b == 0)
			return a;
		return USCLN(b, a % b);
	}

}
