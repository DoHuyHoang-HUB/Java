package phan03;
/**
 * 4.   Viết chương trình giải phương trình bậc 1.
 * @author DoHuyHoang
 */
import java.util.Scanner;
public class Bai04 {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhap a: ");
		float a = nhap.nextFloat();
		System.out.print("Nhap b: ");
		float b = nhap.nextFloat();
		nhap.close();
		try {
			System.out.println(giaiPTBac(a,b));
		}
		catch(Exception e) {
			System.out.print(e.getMessage());
		}

	}
	public static float giaiPTBac(float a, float b) throws Exception
	{
		if(a == 0)
			if(b == 0)
				throw new Exception("PT vo so nghiem");
			else
				throw new Exception("PT vo nghiem");
		else
			return -b / a;
	}

}
