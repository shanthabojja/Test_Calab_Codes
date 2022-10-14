package Java9;
//Write a program to print the names of students by creating a student class. 
//if no name is passed while creating an object of the student class, then the n
//name should be unknown.

// Student Class which has only one variable and one function. The variable is 
// Student name and the function is to print the name of the student.

class Student {
	String name = "Unknown";
	public void getName() {
		System.out.println("This student name is "+ name);
	}
	public void setName(String FirstName) {
		name = FirstName;
	}
	}


public class MainProgram {
	public static void main(String[] args) {
		Student firstStudent = new Student();
		Student secondStudent = new Student();
		Student thirdStudent = new Student();
		
		firstStudent.setName("Ram");
		secondStudent.setName("Shanthi");
		firstStudent.getName();
		secondStudent.getName();
		thirdStudent.getName();
	}

	
}