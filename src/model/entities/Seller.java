package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Seller implements Serializable {
	
	private static final long serialVersionUID = 1L;
private Integer id;
private String name;
private String email;
private Date birthDate;
private Double baseSalary;

private Department department;

public Seller() {
	
}

public Seller(Integer id, String name, String email, Date birthDate, Double baseSalary, Department department) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.birthDate = birthDate;
	this.baseSalary = baseSalary;
	this.department = department;
}

public Date getBirthDate() {
	return birthDate;
}

public void setBirthDate(Date birthDate) {
	this.birthDate = birthDate;
}

public Double getBaseSalary() {
	return baseSalary;
}

public void setBaseSalary(Double baseSalary) {
	this.baseSalary = baseSalary;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmial() {
	return email;
}

public void setEmial(String emial) {
	this.email = emial;
}

public Department getDepartment() {
	return department;
}

public void setDepartment(Department department) {
	this.department = department;
}

@Override
public int hashCode() {
	return Objects.hash(id);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Seller other = (Seller) obj;
	return Objects.equals(id, other.id);
}

@Override
public String toString() {
	return "Seller [id=" + id + ", name=" + name + ", email=" + email + ", department=" + department + "]";
}


}