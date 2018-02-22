package com.revature.beans;

public class Candy {

	public Candy(int id, String name, String type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
	}
	public Candy(String name, String type) {
		this.name=name;
		this.type=type;
	}
	public Candy() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int id;
	private String name;
	private String type;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
