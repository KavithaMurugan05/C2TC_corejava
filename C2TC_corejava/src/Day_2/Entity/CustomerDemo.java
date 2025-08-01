package Day_2.Entity;

public class CustomerDemo {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		Customer c3 = new Customer();
		c1.setCid(17);
		c2.setCid(29);
		c3.setCid(2424);
		c1.setCname("He");
		c2.setCname("She");
		c3.setCname("They");
		c1.setCity("puducherry");
		c2.setCity("puducherry");
		c3.setCity("Chennai");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}

}
