package phan03;
/**
 * 6.   Viết chương trình kiểm tra số nhập vào có phải là số nguyên tố hay không.
 * @author DoHuyHoang
 */
import java.util.Scanner;
public class Bai06 {
	private static Scanner nhap = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Nhap so de kiem tra: ");
		int n = nhap.nextInt();
		if(kiemTraNguyenTo(n) == true)
			System.out.println(n +" la so nguyen to");
		else
			System.out.println(n +" khong phai so nguyen to");
		
	}
	static boolean kiemTraNguyenTo(int n){
		  for(int i = 2; i <= Math.sqrt(n); i++)
			  if(n % i == 0)
				  return false;
		  return true;
		 }

}
