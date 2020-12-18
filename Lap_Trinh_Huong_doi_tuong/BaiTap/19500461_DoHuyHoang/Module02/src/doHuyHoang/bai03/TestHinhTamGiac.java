package doHuyHoang.bai03;

public class TestHinhTamGiac {

	public static void main(String[] args) {
		HinhTamGiac arr[] = new HinhTamGiac[5];
		arr[0] = new HinhTamGiac(-1, 9, 7);
		arr[1] = new HinhTamGiac(2, -8, 9);
		arr[2] = new HinhTamGiac(10, 11, 12);
		arr[3] = new HinhTamGiac(10, 10, 11);
		arr[4] = new HinhTamGiac(10, 10, 10);
		System.out.print(HinhTamGiac.e());
		for (HinhTamGiac hinhTamGiac : arr) {
			System.out.println(hinhTamGiac);
		}
	}

}
