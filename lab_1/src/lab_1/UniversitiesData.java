package lab_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class UniversitiesData {
	
	@SuppressWarnings("serial")
	public static List<Student> GetUSMStudents() {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Ion", "Mudrea", 18, new HashMap<String, Double>(){{ put("History", 8.78); put("Math", 9.1);}}));
		students.add(new Student("Marta", "Oprea", 19, new HashMap<String, Double>(){{ put("History", 9.22); put("Math", 9.15);}}));
		students.add(new Student("Elena", "Codreanu", 20, new HashMap<String, Double>(){{ put("History", 8.50); put("Math", 8.80);}}));
		students.add(new Student("Nicolae", "Virtosu", 19, new HashMap<String, Double>(){{ put("History", 7.66); put("Math", 8.55);}}));
		students.add(new Student("Andrei", "Surdu", 18, new HashMap<String, Double>(){{ put("History", 8.40); put("Math", 9.40);}}));
		return students;
	}
	
	@SuppressWarnings("serial")
	public static List<Student> GetUTMStudents() {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Sandu", "Postolachi", 19, new HashMap<String, Double>(){{ put("History", 8.50); put("Math", 9.0);}}));
		students.add(new Student("Maria", "Lesnic", 20, new HashMap<String, Double>(){{ put("History", 8.80); put("Math", 8.35);}}));
		students.add(new Student("Marcel", "Colesnic", 20, new HashMap<String, Double>(){{ put("History", 8.95); put("Math", 9.35);}}));
		students.add(new Student("Nicolae", "Palamari", 18, new HashMap<String, Double>(){{ put("History", 8.27); put("Math", 9.32);}}));
		students.add(new Student("Andrei", "Ursu", 19, new HashMap<String, Double>(){{ put("History", 8.75); put("Math", 9.18);}}));
		return students;
	}
	
	@SuppressWarnings("serial")
	public static List<Student> GetASEMStudents() {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Radu", "Stefan", 19, new HashMap<String, Double>(){{ put("History", 6.78); put("Math", 7.80);}}));
		students.add(new Student("Ioana", "Popa", 19, new HashMap<String, Double>(){{ put("History", 9.35); put("Math", 9.00);}}));
		students.add(new Student("Zinaida", "Popescu", 18, new HashMap<String, Double>(){{ put("History", 8.95); put("Math", 9.80);}}));
		students.add(new Student("Alexandru", "Rebeja", 20, new HashMap<String, Double>(){{ put("History", 8.80); put("Math", 9.55);}}));
		students.add(new Student("Andrei", "Spinu", 19, new HashMap<String, Double>(){{ put("History", 9.40); put("Math", 9.50);}}));
		return students;
	}
	
	public static HashMap<String, Double> CalculateMean(List<Student> students) {
		HashMap<String, List<Double>> marks = new HashMap<String, List<Double>>();
		HashMap<String, Double> means = new HashMap<String, Double>();
		Set<String> courseNames = null;
		
		for (Student student : students) {
			courseNames = student.Courses.keySet();
			
			for(String courseName : courseNames) {
				Double mark = student.Courses.get(courseName);
				
				if(!marks.containsKey(courseName)) {
					ArrayList<Double> list =  new ArrayList<Double>();
					list.add(mark);
					marks.put(courseName, list);
				}
				else {
					marks.get(courseName).add(mark);
				}
			}
					
			for(String courseName : courseNames) {
				Double mean = marks.get(courseName).stream().mapToDouble(val -> val).average().orElse(0.0);
				means.put(courseName, mean);
			}
		}
		
		return means;
	}
}
