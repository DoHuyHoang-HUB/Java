package phan03;
/**
 * 3.   Viết chương trình in ra tổng 1+3+5 …. +n nếu n là số chẵn, 2+4+6+ …. n nếu n là số lẻ.
 * @author DoHuyHoang
 */
import java.util.Scanner;
public class Bai03 {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = nhap.nextInt();
		nhap.close();
		System.out.println(tongChanLe(n));

	}
	public static int tongChanLe(int n)
	{
		int tong = 0;
		if(n % 2 ==0) 
			for(int i = 0; i < n; i++)
				tong += i;
		else
			for(int i = 0; i < n; i++)
				tong += i;
		return tong;
	}

}
