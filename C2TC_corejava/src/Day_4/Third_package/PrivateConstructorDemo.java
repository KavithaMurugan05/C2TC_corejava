package Day_4.Third_package;

public class PrivateConstructorDemo {

	public static void main(String[] args) {
		// Myclass m1=new Myclass();
		
				Myclass m=Myclass.getObject();
				m.setId(11);
				
				Myclass m1=Myclass.getObject();
				
				System.out.println(m);
				System.out.println(m1);
	}

}
