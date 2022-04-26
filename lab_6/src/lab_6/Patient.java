package lab_6;

import java.util.Date;
import java.util.List;

public class Patient extends Person {
	private String id;
	private Integer age;
	private Date accepted;
	private History sickness;
	private List<String> prescriptions;
	private List<String> allergies;
	private List<String> specialReqs;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getAccepted() {
		return accepted;
	}
	public void setAccepted(Date accepted) {
		this.accepted = accepted;
	}
	public History getSickness() {
		return sickness;
	}
	public void setSickness(History sickness) {
		this.sickness = sickness;
	}
	public List<String> getPrescriptions() {
		return prescriptions;
	}
	public void setPrescriptions(List<String> prescriptions) {
		this.prescriptions = prescriptions;
	}
	public List<String> getAllergies() {
		return allergies;
	}
	public void setAllergies(List<String> allergies) {
		this.allergies = allergies;
	}
	public List<String> getSpecialReqs() {
		return specialReqs;
	}
	public void setSpecialReqs(List<String> specialReqs) {
		this.specialReqs = specialReqs;
	}
}
