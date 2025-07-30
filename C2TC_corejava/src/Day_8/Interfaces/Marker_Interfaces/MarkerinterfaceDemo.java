package Day_8.Interfaces.Marker_Interfaces;

public class MarkerinterfaceDemo {

	public static void main(String[] args) {
		Student s=new Student(101,"Neha",12000,"C++");
		if (s instanceof Registrable )
			System.out.println("Student is registered for the course");
		else
			System.out.println("Student is not registered for the course");
			
	}

}
