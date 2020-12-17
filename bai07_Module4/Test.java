package bai07_Module4;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Test {
	private static Employee inputEmployee() {
		Employee employee = null;
		System.out.print("Nhập mã nhân viên: ");
		int aPayrollMent = new Scanner(System.in).nextInt();
		System.out.print("Nhập tên nhân viên: ");
		String aName = new Scanner(System.in).nextLine();
		System.out.print("Nhập lương cơ bản: ");
		double aBasicMonthlySalary = new Scanner(System.in).nextDouble();
		System.out.println("1. Nhân viên lập trình viên.");
		System.out.println("2. Nhân viên quản lí dự án.");
		System.out.println("3. Nhân viên quản lí.");
		System.out.print("Chọn loại nhân viên: ");
		int key = new Scanner(System.in).nextInt();
		
		switch (key) {
		case 1:
			System.out.print("Nhập ngôn ngữ lập trình: ");
			String aLanguage = new Scanner(System.in).nextLine();
			employee = new Programmer(aPayrollMent, aName, aBasicMonthlySalary, aLanguage);
			break;
		case 2:
			System.out.print("Nhập ngôn ngữ lập trình: ");
			String aLanguage2 = new Scanner(System.in).nextLine();
			employee = new ProjectLeader(aPayrollMent, aName, aBasicMonthlySalary, aLanguage2);
			break;
		case 3:
			System.out.print("Nhập phòng ban: ");
			String aDepartment = new Scanner(System.in).nextLine();
			employee = new Administrator(aPayrollMent, aName, aBasicMonthlySalary, aDepartment);
			break;
		default:
			System.out.println("Nhập sai! Nhập lại:");
			break;
		}
		return employee;
	}
	public static void main(String[] args) {
		SoftwareHouse list = new SoftwareHouse("Công ty Đỗ Huy Hoàng");
		int key;
		do {
			System.out.println("-------MENU------\n1. Nhập danh sách nhân viên ban đầu.");
			System.out.println("2. Xuất danh sách nhân viên.");
			System.out.println("3. Thêm nhân viên.");
			System.out.println("4. Tính tổng tiền lãi của nhân viên.");
			System.out.println("5. Sắp xếp danh sách nhân viên theo tên.");
			System.out.println("6. Xuất danh sách lập trình viên.");
			System.out.println("7. Cập nhật phòng ban cho quản lí.");
			System.out.println("8. Xóa nhân viên theo mã.");
			System.out.print("Chọn chương trình: ");
			key = new Scanner(System.in).nextInt();
			
			switch (key) {
			case 1:
				System.out.print("Nhập số lượng sinh viên: ");
				int n = new Scanner(System.in).nextInt();
				for (int i = 0; i < n; i++) {
					if(list.addEmployee(inputEmployee()) == true)
						System.out.println("Thêm thành công");
					else
						System.out.println("Thêm không thành công");
				}
				break;
			case 2:
				if(list.isEmpty() == false)
					System.out.println("Danh sách rỗng! Vui lòng nhập danh sách nhân viên.\n");
				else {
					System.out.println(list.getaName());
					System.out.println(list);
				}
				break;
			case 3:
				System.out.print("Nhập số nhân viên cần thêm: ");
				int n2 = new Scanner(System.in).nextInt();
				for (int i = 0; i < n2; i++) {
					if(list.addEmployee(inputEmployee()) == true)
						System.out.println("Thêm thành công");
					else
						System.out.println("Thêm không thành công");
				}
				break;
			case 4:
				if(list.isEmpty() == false)
					System.out.println("Danh sách rỗng! Vui lòng nhập danh sách nhân viên.\n");
				else {
					Locale k = new Locale("EN", "US");
					NumberFormat numberFormat = NumberFormat.getCurrencyInstance(k);
					System.out.println("Tổng tiền phải trả cho nhân viên: " + numberFormat.format(list.getMonthlySalaryBill()) + "\n");
				}
				break;
			case 5:
				if(list.isEmpty() == false)
					System.out.println("Danh sách rỗng! Vui lòng nhập danh sách nhân viên.\n");
				else {
					list.sortAllStaffByName();
					System.out.println(list);
				}
				break;
			case 6:
				if(list.isEmpty() == false)
					System.out.println("Danh sách rỗng! Vui lòng nhập danh sách nhân viên.\n");
				else {
					System.out.println("Danh sách nhân viên là lập trình viên: \n" + list.displayListProgrammer());
				}
				break;
			case 7:
				if(list.isEmpty() == false)
					System.out.println("Danh sách rỗng! Vui lòng nhập danh sách nhân viên.\n");
				else {
					System.out.print("Nhập mã cần cập nhật: ");
					int aPayrollNo2 = new Scanner(System.in).nextInt();
					System.out.print("Sửa phòng ban: ");
					String aDepartment = new Scanner(System.in).nextLine();
					if(list.updateDepartmentForAdmin(aPayrollNo2, aDepartment) == true)
						System.out.println("Cập nhật thành công");
					else
						System.out.println("Cập nhật không thành công");
					System.out.println(list);
				}
				break;
			case 8:
				if(list.isEmpty() == false)
					System.out.println("Danh sách rỗng! Vui lòng nhập danh sách nhân viên.\n");
				else {
					System.out.print("Nhập mã cần xóa: ");
					int aPayrollNo = new Scanner(System.in).nextInt();
					if(list.deleteEmployee(aPayrollNo)== true)
						System.out.println("Xóa thành công");
					else
						System.out.println("Xóa không thành công");				
					System.out.println(list);
				}
				break;
			default:
				System.out.println("Nhập sai! Nhập lại: ");
				break;
			}
		} while (key != 0);
	}

}
