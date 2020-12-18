package phan03;

import java.util.Scanner;

/**
 * 15.   Viết chương trình in ra giá trị lớn nhất và nhỏ nhất trong một dãy các giá trị user đã nhập.
 * @author DoHuyHoang
 *
 */
public class Bai15 {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = nhap.nextInt();
		int [] a = new int[n];
		System.out.println("Nhap mang: ");
		for(int i = 0; i < n; i++) {
			System.out.printf("a[%d] = ", i);
			a[i] = nhap.nextInt();
		}
		nhap.close();
		int min = a[0];
		int max = a[0];
		for(int i = 0; i < a.length; i++) {
			if(a[i] < min)
				min = a[i];
			if(a[i] > max)
				max = a[i];
		}
		System.out.println("Gia tri nho nhat la: "+ min);
		System.out.println("Gia tri lon nhat la: "+ max);
	}

}
