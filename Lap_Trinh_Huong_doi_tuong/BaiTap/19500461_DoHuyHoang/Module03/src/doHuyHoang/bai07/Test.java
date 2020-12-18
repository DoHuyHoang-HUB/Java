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
		DanhSachNhanVien list = new DanhSachNhanVien();
		
		list.them(new SalariedEmployee("Do Huy", "Hoang", "01", 5000000));
		list.them(new HourEmployee("Nguyen", "Hung", "02", 500000, 12));
		list.them(new CommissionEmployee("Ngo Trung", "Hieu", "03", 10000000, 0.05f));
		list.them(new BasePlusCommissionEmployee("Ha Minh", "Duc", "04", 10000000, 0.04f, 2000000));

		System.out.println(list.xuatSalariedEmployee());
		
		System.out.println(list.xuatHourEmployee());
		
		System.out.println(list.xuatCommissionEmployee());
		
		System.out.println(list.xuatBasePlusCommissionEmployee());

	}

}
