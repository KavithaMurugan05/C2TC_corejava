package Day_8.Interfaces.Functional_Interfaces;

public class FunctionalinterfaceDemo {

	public static void main(String[] args) {
		GreetClass g = new GreetClass();
		System.out.println(g.greet());

		//using Lambda Expression
		GreetInterface g1 = () -> {
			return "Good Afternoon";
		};

		System.out.println(g1.greet());

	}
}