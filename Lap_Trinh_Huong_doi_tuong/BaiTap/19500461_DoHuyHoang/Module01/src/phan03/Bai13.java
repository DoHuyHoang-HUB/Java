package phan03;
/**
 * 13.   Viết chương trình in ra những số lẻ từ 1 đến 99.
 * @author DoHuyHoang
 *
 */
public class Bai13 {

	public static void main(String[] args) {
		for(int i = 1; i <= 99; i++)
			if(i % 2 != 0)
				System.out.printf("%d\n", i);

	}

}
