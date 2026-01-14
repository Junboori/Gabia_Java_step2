package chapter10.Multiinterface;

public class CustomerMain_02 {

	public static void main(String[] args) {
		
		//자식
		Customer customer = new Customer();
		System.out.println("==Buy==");
		//부모
		Buy buyer = customer;
		buyer.buy();
		buyer.order();

		System.out.println("==Sell==");
		Sell seller = customer;
		seller.sell();
		seller.order();

		// seller 부모 | Customer 자식
		if (seller instanceof Customer) {
			Customer customer2 = (Customer) seller;
			System.out.println("-------Down Chasting-------");
			customer2.buy();
			customer2.sell();
			customer2.sellorder();
			customer2.order();
		} // if
	}

}
