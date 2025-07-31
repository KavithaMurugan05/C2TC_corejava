package Day_2.Entity;

import Day_2.Entity.Customer;

public class CustomerDemo {

	public static void main(String[] args) {
		Customer c1 = new Customer();
	    c1.setCid(100);
	    c1.setCname("he");
	    c1.setCity("there");
	    System.out.println(c1);
	    
	    Customer c2 = new Customer();
	    c2.setCid(101);
	    System.out.println(c2);
	    c2.getCname();
	}

}
