package com.telusko.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {
	@Id
	private int id;
	private String name;
	private String lang1;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getLang1() {
		return lang1;
	}
	public void setLang1(String lang) {
		this.lang1 = lang;
	}
	public String toString()
	{
		return "Alien id "+id+" name "+name +" lang "+lang1;
		
	}
  
}
