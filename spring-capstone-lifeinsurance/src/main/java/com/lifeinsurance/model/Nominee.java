package com.lifeinsurance.model;

import javax.persistence.Entity;

@Entity
public class Nominee {
	
	private String nomineeName;
	private String gender;
	private int age;
	private String relation;
	
	public Nominee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Nominee(String nomineeName, String gender, int age, String relation) {
		super();
		this.nomineeName = nomineeName;
		this.gender = gender;
		this.age = age;
		this.relation = relation;
	}
	public String getNomineeName() {
		return nomineeName;
	}
	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	@Override
	public String toString() {
		return "Nominee [nomineeName=" + nomineeName + ", gender=" + gender + ", age=" + age + ", relation=" + relation
				+ "]";
	}
	
	
	

}
