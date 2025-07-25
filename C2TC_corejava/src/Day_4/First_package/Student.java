package Day_4.First_package;

public class Student {
	private String studentName;
	private int studentAge;
	private String studentCity;
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	public Student() {
		System.out.println("Default Constructor");
	}
	
	public Student(String studentName, int studentAge, String studentCity) {
		System.out.println("Parameterized Constructor");
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentCity = studentCity;
	}
}