/**
 * 
 */
package doHuyHoang.bai07;

/**
 * @author Do-Huy-Hoang
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SoftwareHouse list = new SoftwareHouse("Cong ty Do Huy Hoang");
		
		list.them(new Programmer(1, "Do Huy Hoang", 9000000, "Java"));
		list.them(new Administrator(2, "Nguyen Hung", 10000000, "Nhan su"));
		list.them(new ProjectLeader(3, "Nguyen Truong Chinh", 7000000, "C/C++"));
		list.them(new Programmer(4, "Ngo Trung Hieu", 9000000, "Python"));
		list.them(new Programmer(5, "Ha Minh Duc", 7000000, "Ruby"));
		
		System.out.println("Danh sach cac nhan vien:\n" + list);
		
		System.out.println("Tong tien nhan vien phai tra: " + list.getMonthSalaryBill());
		
		list.sapXepTangDanTheoTen();
		System.out.println("Danh sach cac nhan vien sau khi sap xep:\n" + list);
		
		System.out.println("Danh sach lap trinh vien:\n" + list.dSLapTrinhVien());
		
		if(list.updateDepartmentForAdmin(2, "Giam doc") == true)
			System.out.println("Cap nhat thanh cong");
		else {
			System.out.println("Khong tim thay ma");
		}
		list.xoaTheoMa(05);
		System.out.println("Danh sach nhan vien sau khi xoa:\n" + list);
			
	}

}
