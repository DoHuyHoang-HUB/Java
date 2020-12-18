package phan03;

import java.util.Scanner;

public class Bai19 {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.print("Moi ban nhap n: ");
		int n = nhap.nextInt();
		nhap.close();
		System.out.println("Hinh 1: ");
		hinhTamGiacVuong(n);
		System.out.println("Hinh 2: ");
		hinh2(n);

	}
	public static void hinhTamGiacVuong(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				if(j == 1 || j == i || i == n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println("");
		}
	}
	public static void hinh2(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				if (i == 1 || i == n) {
					System.out.print("* ");
				} 
				else {
					if (j == 1 || j == n)
						System.out.print("* ");
					else
						for(int k = j; k >=  1; k--) {
							if(k == j)
								System.out.print("* ");
							else
								System.out.print("  ");
						}
				}
			}
			System.out.println("");
		}
	}

}
