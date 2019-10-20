package com.demosecurity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cctable")
public class DashboardModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer emp_id;
	private String name;
	private String contact;
	
	
	
	
	public Integer getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(Integer emp_id) {
		this.emp_id = emp_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "DashboardModel [emp_id=" + emp_id + ", name=" + name + ", contact=" + contact + "]";
	}
	
	

}
