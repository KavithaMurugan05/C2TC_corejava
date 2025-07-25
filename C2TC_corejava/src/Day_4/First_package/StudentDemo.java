package Day_4.First_package;

import java.util.Scanner;
public class StudentDemo {

	public static void main(String[] args) {
		Student s = new Student(); // default constructor invoked

		Scanner sc = new Scanner(System.in);
		String name, city;
		int age;
		System.out.println("Enter Person details : Name, age and city");
		name = sc.nextLine();
		age = sc.nextInt();
		sc.nextLine();
		city = sc.nextLine();
		// s.StudentName=name private member can't accessible
		s.setStudentName(name);
		s.setStudentAge(age);
		s.setStudentCity(city);
		System.out.println("Student Details Name : " + s.getStudentName() + "\tAge : " + s.getStudentAge() + "\tCity : "
				+ s.getStudentCity());

		System.out.println("Enter Person details : Name, age and city");
		name = sc.nextLine();
		age = sc.nextInt();
		sc.nextLine();
		city = sc.nextLine();
		s = new Student(name, age, city); // parameterized constructor invoked);
		System.out.println("Student Details Name : " + s.getStudentName() + "\tAge : " + s.getStudentAge() + "\tCity : "
				+ s.getStudentCity());
		sc.close();
	}
}