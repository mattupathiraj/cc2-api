package com.example.demo.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Patients")
public class patiententity {
	@Id
	@Column(name="patientid")
	private int patientid;
	@Column(name="patientname")
	private String patientname;
	@Column(name="phno")
	private int phno;
	@Column(name="city")
	private String city;
	public patiententity(int patientid, String patientname, int phno, String city) {
		super();
		this.patientid = patientid;
		this.patientname = patientname;
		this.phno = phno;
		this.city = city;
	}
	public int getPatientid() {
		return patientid;
	}
	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}
	public String getPatientname() {
		return patientname;
	}
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public patiententity() {
		
	}
}