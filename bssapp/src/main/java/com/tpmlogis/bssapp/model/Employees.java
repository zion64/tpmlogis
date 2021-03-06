package com.tpmlogis.bssapp.model;

// Generated 2014. 3. 4 ?? 10:20:32 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

/**
 * Employees generated by hbm2java
 */
public class Employees implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2838468200575557423L;
	private int employeenumber;
	private Integer version;
	private Offices offices;
	private Employees employees;
	private String lastname;
	private String firstname;
	private String extension;
	private String email;
	private String jobtitle;
	private Set employeeses = new HashSet(0);
	private Set customerses = new HashSet(0);

	public Employees() {
	}

	public Employees(int employeenumber, Offices offices, String lastname, String firstname, String extension, String email, String jobtitle) {
		this.employeenumber = employeenumber;
		this.offices = offices;
		this.lastname = lastname;
		this.firstname = firstname;
		this.extension = extension;
		this.email = email;
		this.jobtitle = jobtitle;
	}

	public Employees(int employeenumber, Offices offices, Employees employees, String lastname, String firstname, String extension,
			String email, String jobtitle, Set employeeses, Set customerses) {
		this.employeenumber = employeenumber;
		this.offices = offices;
		this.employees = employees;
		this.lastname = lastname;
		this.firstname = firstname;
		this.extension = extension;
		this.email = email;
		this.jobtitle = jobtitle;
		this.employeeses = employeeses;
		this.customerses = customerses;
	}

	public int getEmployeenumber() {
		return this.employeenumber;
	}

	public void setEmployeenumber(int employeenumber) {
		this.employeenumber = employeenumber;
	}

	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Offices getOffices() {
		return this.offices;
	}

	public void setOffices(Offices offices) {
		this.offices = offices;
	}

	public Employees getEmployees() {
		return this.employees;
	}

	public void setEmployees(Employees employees) {
		this.employees = employees;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getExtension() {
		return this.extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJobtitle() {
		return this.jobtitle;
	}

	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}

	public Set getEmployeeses() {
		return this.employeeses;
	}

	public void setEmployeeses(Set employeeses) {
		this.employeeses = employeeses;
	}

	public Set getCustomerses() {
		return this.customerses;
	}

	public void setCustomerses(Set customerses) {
		this.customerses = customerses;
	}

}
