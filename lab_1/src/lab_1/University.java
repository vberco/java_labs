package lab_1;

import java.util.List;

public class University {
	public String Name;
	public int FoundationYear;
	public List<Student> Students;
	
	public University() {}
	
	public University(String name, int foundationYear) {
		this.Name = name;
		this.FoundationYear = foundationYear;
	}
	
	public University(String name, int foundationYear, List<Student> students) {
		this.Name = name;
		this.FoundationYear = foundationYear;
		this.Students = students;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getFoundationYear() {
		return FoundationYear;
	}
	public void setFoundationYear(int foundationYear) {
		FoundationYear = foundationYear;
	}
	@Override
	public String toString() {
		return "University [Name=" + Name + ", FoundationYear=" + FoundationYear + ", Students=" + Students + "]";
	}

	public List<Student> getStudents() {
		return Students;
	}
	public void setStudents(List<Student> students) {
		Students = students;
	}
}
