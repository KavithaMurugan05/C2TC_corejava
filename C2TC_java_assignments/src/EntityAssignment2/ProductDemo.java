package EntityAssignment2;

public class ProductDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p = new Product();
		Product q = new Product();
		p.setProductid(4921);
		p.setCost(2000);
		p.setQuantity(1);
		q.setProductid(1010);
		q.setCost(5500);
		q.setQuantity(1);
		System.out.println(p);
        System.out.println(q);
	}

}
