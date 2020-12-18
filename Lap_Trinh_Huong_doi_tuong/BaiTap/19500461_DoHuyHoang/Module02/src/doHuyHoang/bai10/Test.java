package doHuyHoang.bai10;

public class Test {

	public static void main(String[] args) {
		try {
			CDList h = new CDList(5);
			h.themCDVaoDanhSach(new DoiTuongCD(1, "e", 5, 5000));
			h.themCDVaoDanhSach(new DoiTuongCD(2, "r", 10, 2000));
			h.themCDVaoDanhSach(new DoiTuongCD(3, "a", 20, 10000));
			System.out.println(h);
			System.out.println("Tim kiem: ");
			System.out.println(h.timKiem(2));
			h.sapXepGiamDan();
			System.out.println("Sap xep danh sach gia tien giam dan: ");
			System.out.println(h);
			h.sapXepTangDan();
			System.out.println();
			System.out.println("Sap xep tua danh sach tang dan: ");
			System.out.println(h);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
