package doHuyHoang.bai06;

public class TestAccount {

	public static void main(String[] args) {
		Account acc1 = new Account("Ted Murphy", 72354, 10256);
		Account acc2 = new Account("Jane Smith", 69713, 4000);
		Account acc3 = new Account("Edward Demsey", 93757, 75932);

		System.out.printf("%-20s %15s %10s", "name", "accountNumber", "balance");
		System.out.printf("\n%s", acc1.toString());
		System.out.printf("\n%s", acc2.toString());
		System.out.printf("\n%s", acc3.toString());
		System.out.println();

		acc1.deposit(2580);
		acc2.deposit(50000);
		System.out.println();
		System.out.println("Sau khi goi tien cho acc1 là 25.85, cho acc2 la 500.00");
		System.out.printf("%-20s %15s %10s", "name", "accountNumber", "balance");
		System.out.printf("\n%s", acc1.toString());
		System.out.printf("\n%s", acc2.toString());
		System.out.println();

		acc2.withdraw(43075, 150);
		System.out.println();
		System.out.println("Sau khi rut khoi acc2 so tien la 430.75, muc phi 1.50");
		System.out.printf("%-20s %15s %10s", "name", "accountNumber", "balance");
		System.out.printf("\n%s", acc2.toString());
		System.out.println();

		acc3.addInterest();
		System.out.println();
		System.out.println("Tinh tien lai cho acc3");
		System.out.printf("%-20s %15s %10s", "name", "accountNumber", "balance");
		System.out.printf("\n%s", acc3.toString());
		System.out.println();

		acc2.tranfer(acc1, 10000);
		System.out.println();
		System.out.println("Chuyen tien tu acc2 sang cho acc1 so tien là 100.00");
		System.out.printf("%-20s %15s %10s", "name", "accountNumber", "balance");
		System.out.printf("\n%s", acc1.toString());
		System.out.printf("\n%s", acc2.toString());

	}

}
