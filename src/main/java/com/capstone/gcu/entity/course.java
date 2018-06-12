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
public class course {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long courseid;
	private String name;
	private String description;
	private String category;
	
	@ManyToMany(cascade = { 
			CascadeType.PERSIST, 
			CascadeType.MERGE
	})
	@JoinTable(name = "student_course",
		joinColumns = @JoinColumn(name = "courseid"),
		inverseJoinColumns = @JoinColumn(name = "studentid"))
	
	private List<student> students;
	
	public List<student> getStudents() {
		return students;
	}

	public void setStudents(List<student> students) {
		this.students = students;
	}

	public course() {

	}

	public course(long courseid, String name, String description, String category) {
		super();
		this.courseid = courseid;
		this.name = name;
		this.description = description;
		this.category = category;
	}
	
	public long getCourseid() {
		return courseid;
	}

	public void setCourseid(long courseid) {
		this.courseid = courseid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "course courseid: " + courseid + ", name: " + name + ", description: " + description + ", category: "
				+ category ;
	}
	
}
