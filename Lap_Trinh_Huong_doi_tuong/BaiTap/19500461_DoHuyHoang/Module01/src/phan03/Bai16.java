package phan03;
/**
 * 16.   Viết chương trình đọc một giá trị nguyên từ bàn phím và in ra số đó là số chẵn, lẻ hoặc zero.
 * @author DoHuyHoang
 */
import java.util.Scanner;

public class Bai16 {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhap mot gia tri nguyen: ");
		int n = nhap.nextInt();
		nhap.close();
		if(n % 2 == 0 && n != 0)
			System.out.printf("%d la so chan", n);
		if(n % 2 != 0)
			System.out.printf("%d la so le", n);
		if(n == 0)
			System.out.printf("%d la so Zero", n);

	}

}
