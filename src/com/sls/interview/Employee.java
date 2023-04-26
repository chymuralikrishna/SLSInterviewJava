package com.sls.interview;
import java.util.Date;
import java.util.Objects;

public class Employee {
	private int ecno;
	private String name;
	private Date dob;
	
	
	public Employee(int ecno, String name, Date dob) {
		super();
		this.ecno = ecno;
		this.name = name;
		this.dob = dob;
	}
	public int getEcno() {
		return ecno;
	}
	public void setEcno(int ecno) {
		this.ecno = ecno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public int hashCode() {
		return Objects.hash(ecno, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return ecno == other.ecno && Objects.equals(name, other.name);
	}
	
}
