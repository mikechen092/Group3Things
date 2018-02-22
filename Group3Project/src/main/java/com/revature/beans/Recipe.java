package com.revature.beans;

import java.util.Arrays;

public class Recipe {
	
	public Recipe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Recipe(String name, String[] recipe) {
		super();
		this.name = name;
		this.recipe = recipe;
	}
	private int id;
	private String name;
	private String[] recipe;
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
	public String[] getRecipe() {
		return recipe;
	}
	public void setRecipe(String[] recipe) {
		this.recipe = recipe;
	}
	@Override
	public String toString() {
		return "Recipe [id=" + id + ", name=" + name + ", recipe=" + Arrays.toString(recipe) + "]";
	}

}
