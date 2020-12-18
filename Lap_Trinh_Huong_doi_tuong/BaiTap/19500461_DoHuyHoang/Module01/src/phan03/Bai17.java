package phan03;
/**
 * 17.   Viết chương trình in ra bội số của 3 từ 300 đến 3.
 * @author DoHuyHoang
 *
 */
public class Bai17 {

	public static void main(String[] args) {
		for(int i = 300; i >= 3; i--)
			if(i % 3 == 0)
				System.out.printf("%5d", i);

	}

}
