package phan03;
/**
 * 9.   Viết chương trình in ra số lần kí tự ‘a’ xuất hiện trong một chuỗi.
 * @author DoHuyHoang
 */
import java.util.Scanner;

public class Bai09 {

	public static void main(String[] args) {
		char kyTu = 'a';
		int count = 0;
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhap vao chuoi bat ki: ");
		String chuoi = nhap.nextLine();
		nhap.close();
		
		for(int i = 0; i < chuoi.length(); i++)
			if(chuoi.charAt(i) == kyTu)
				count++;
		
		System.out.println("So lan ki tu xuat hien " + kyTu + " trong chuoi " + chuoi + " = " + count);
		
				
		
	}

}
