package Day_4.First_package;

public class Executor {
public static void main(String[] args) {
		
		//accessing same package class
			Person p=new Person();
			p.methodDefault();
			p.methodProtected();
			p.methodPublic();
			
			p.varDefault=11;
			p.methodDefault();
			
			//private member can't accessible
			/*b1.varPrivate=21; 
			b1.methodPrivate();*/
			
			p.varProtected=31;
			p.methodProtected();
			
			p.varPublic=41;
			p.methodPublic();
			
			//instance of operator
			System.out.println(p instanceof Person); //returns True
			
			/*
			 Person p=new Person(); System.out.println(p instanceOf Base); //CTE
			 Incompatible types
			 */	}
}