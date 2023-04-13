package com.sls.interview;
import java.util.Objects;

public class Employee {
	private int ecno;
	private String name;
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
