package lab_6;

import java.util.List;

public class Doctor extends OperationsStaff {
	private List<String> specialty;
	private List<String> locations;
	
	public List<String> getSpecialty() {
		return specialty;
	}
	public void setSpecialty(List<String> specialty) {
		this.specialty = specialty;
	}
	public List<String> getLocations() {
		return locations;
	}
	public void setLocations(List<String> locations) {
		this.locations = locations;
	}
}
