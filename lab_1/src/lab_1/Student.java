package lab_1;

import java.util.HashMap;

public class Student {
	public String FirstName;
	public String LastName;
	public int Age;
	public HashMap<String, Double> Courses;
	
	@Override
	public String toString() {
		return "Student [FirstName=" + FirstName + ", LastName=" + LastName + ", Age=" + Age + ", Courses=" + Courses
				+ "]";
	}

	public Student() {}
	
	public Student(String firstName, String lastName, int age, HashMap<String, Double> courses) {
		this.FirstName = firstName;
		this.LastName = lastName;
		this.Age = age;
		this.Courses = courses;
	}
	
	public Student(String firstName, String lastName, int age) {
		this.FirstName = firstName;
		this.LastName = lastName;
		this.Age = age;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public HashMap<String, Double> getCourses() {
		return Courses;
	}
	public void setCourses(HashMap<String, Double> courses) {
		Courses = courses;
	}	
}
