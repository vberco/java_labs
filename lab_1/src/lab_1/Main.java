package lab_1;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		 System.out.println("Start lab");
		 Monitor monitor = new Monitor();
		 monitor.Color = "Red";
		 monitor.Resolutions = "1924 x 1080";
		 monitor.Dimension = 24.1;
		 Monitor blackMonitor = new Monitor("Black", "1920 x 1200", 27.2);
		 System.out.println("Monitor: " + monitor.toString());
		 System.out.println("Black monitor " + blackMonitor.toString());
		 
		 if (monitor.equals(blackMonitor)) {
			 System.out.println("These monitors are identical");
		 } 
		 else {
			 System.out.println("These monitors are different");
		 }
		 
		 monitor.Color = "Black";
		 monitor.Resolutions = "1920 x 1200";
		 monitor.Dimension = 27.2;
		 System.out.println("Changed monitor: " + monitor.toString());
		 
		 if (monitor.equals(blackMonitor)) {
			 System.out.println("These monitors are identical");
		 } 
		 else {
			 System.out.println("These monitors are different");
		 }
		 
		 List<Student> students = new ArrayList<Student>();
		 Student student = new Student("Ion", "Munteanu", 20);
		 HashMap<String, Double> courses = new HashMap<String, Double>();
		 courses.put("Politology", 8.5);
		 courses.put("History", 9.1);
		 student.Courses = courses;
		 students.add(student);
		 University university = new University("University of Politology", 1990, students);
		 
		 System.out.println(student);
		 System.out.println(university);
		 
		 student.Courses.replace("Politology", 8.5, 9.2);
		 university.FoundationYear = 1988;
		 
		 System.out.println(student);
		 System.out.println(university);
		 
		 University universityUsm = new University("USM", 1960, UniversitiesData.GetUSMStudents());
		 University universityUtm = new University("UTM", 1964);
		 universityUtm.Students = UniversitiesData.GetUTMStudents();
		 University universityAsem = new University("ASEM", 1990, UniversitiesData.GetASEMStudents());
		 
		 var usmMeans = UniversitiesData.CalculateMean(universityUsm.Students);
		 var utmMeans = UniversitiesData.CalculateMean(universityUtm.Students);
		 var asemMeans = UniversitiesData.CalculateMean(universityAsem.Students);
		 var history = "History";
		 var math = "Math";
		 
		 System.out.println("Name | History | Math");
		 System.out.println(universityUsm.Name +" | " + usmMeans.get(history) +" | " + usmMeans.get(math));
		 System.out.println(universityUtm.Name +" | " + utmMeans.get(history) +" | " + utmMeans.get(math));
		 System.out.println(universityAsem.Name +" | " + asemMeans.get(history) +" | " + asemMeans.get(math));
	}

}
