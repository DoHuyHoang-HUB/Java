package doHuyHoang.bai08;

public class Test {

	public static void main(String[] args) {
		LopHocPhan lhp = new LopHocPhan("123456", "LT huong doi tuong", "Co Ha", "Thu 7, Tiet 4 - 6, phong A1.1", 3);
		lhp.addDSSV(new SinhVien("123", "Nguyen Van A"));
		lhp.addDSSV(new SinhVien("543", "Le Thi B"));
		lhp.addDSSV(new SinhVien("321", "Luong Van C"));
		System.out.println(lhp);
		
	}	
}
 