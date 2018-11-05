package by.epam.hw8;

public class PaymentMain {

	public static void main(String[] args) {
		Payment payment = new Payment();
		payment.add(new Item("tv",334455,250));
		payment.add(new Item("blender",334433,50));
		payment.add(new Item("ps4",322455,150));
	}

}
