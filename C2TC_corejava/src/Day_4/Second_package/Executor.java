package Day_4.Second_package;
import Day_4.First_package.Person;
public class Executor {

	public static void main(String[] args) {
		Person p = new Person();

		// private, default and protected members can't access

		/*
		 * b1.varPrivate=21; b1.methodPrivate(); b1.varDefault=11; b1.methodDefault();
		 * b1.varProtected=31; b1.methodProtected();
		 */

		p.methodPublic();
		p.varPublic = 41;
		p.methodPublic();
	}
}