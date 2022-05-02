package com.courses.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
 
@Entity
public class Courses {
	@Id
	private long id;
	private String tittle;
	private String description;
	public Courses(long id, String tittle, String description) {
		super();
		this.id = id;
		this.tittle = tittle;
		this.description = description;
	}
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Courses [id=" + id + ", tittle=" + tittle + ", description=" + description + "]";
	}
	
	


}
