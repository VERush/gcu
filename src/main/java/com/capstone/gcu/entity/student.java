package com.capstone.gcu.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long studentid;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private String phone;
	private String address;
//	private List<course> courses;
	
	public student() {

	}

	public student(long studentid, String firstname, String lastname, String email, String password, String phone,
			String address) {
		super();
		this.studentid = studentid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.address = address;
	}
	
//    @ManyToMany(cascade = { 
//            CascadeType.PERSIST, 
//            CascadeType.MERGE
//        })
//        @JoinTable(name = "student_course",
//            joinColumns = @JoinColumn(name = "studentid"),
//            inverseJoinColumns = @JoinColumn(name = "courseid"))

	public long getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "student studentid: " + studentid + ", firstname: " + firstname + ", lastname: " + lastname + ", email: "
				+ email + ", password: " + password + ", phone: " + phone + ", address: " + address;
	}

	
	
}
