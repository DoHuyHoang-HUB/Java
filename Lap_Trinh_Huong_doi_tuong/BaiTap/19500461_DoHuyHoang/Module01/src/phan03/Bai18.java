package phan03;
/**
 * 18.   Viết chương trình nhập vào số nguyên n và thực hiện:  Xuất ra màn hình n số đầu tiên của chuỗi Fibonaci (có hai giá trị đầu là 1 và 1).
 * @author DoHuyHoang
 */

import java.util.Scanner;

public class Bai18 {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = nhap.nextInt();
		nhap.close();
        System.out.printf("%d số đầu tiên của dãy số fibonacci: \n", n);
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + "\n");
        }
    }
    public static int fibonacci(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
 
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }
}
