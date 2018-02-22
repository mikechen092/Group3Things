package com.revature.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CANDY")
public class Candy implements Serializable {

	
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
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="candySequence")
	@SequenceGenerator(allocationSize=1,name="candySequence",sequenceName="SQ_CANDY_PK")
	@Column (name="CANDY_ID")
	private int id;
	@Column(name="CANDY_NAME")
	private String name;
	@Column(name="TYPE")
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
	@Override
	public String toString() {
		return "Candy [id=" + id + ", name=" + name + ", type=" + type + "]";
	}
	
}
