package by.epam.hw8;

public class BankAccount {
	private int amount;
	private String name;
	
	public BankAccount (int amount, String name) {
		this.amount = amount;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || obj.getClass() != getClass())
			return false;
		BankAccount acc = (BankAccount) obj;
		if (amount != acc.amount)
			return false;
		if (name == null) {
			if (acc.name != null) 
				return false;
		} else if (!name.equals(acc.name)) 
			return false;		
		return true;
	}
	
	@Override
	public int hashCode() {		
		return (int) (31 * amount + ((null == name) ? 0 : name.hashCode()));
	}
	
}
