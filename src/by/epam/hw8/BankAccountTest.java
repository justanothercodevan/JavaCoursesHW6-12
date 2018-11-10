package by.epam.hw8;

public class BankAccountTest {

	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount(423423, "Petr");
		BankAccount acc2 = new BankAccount(444, "Vasya");
		BankAccount acc3 = new BankAccount(444, "Vasya");
		
		System.out.println(acc1.equals(acc2));
		System.out.println(acc1.equals(acc3));
		System.out.println(acc2.equals(acc3));

	}

}
