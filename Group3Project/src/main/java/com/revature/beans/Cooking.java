package com.revature.beans;

public class Cooking {
	public Cooking(int recipeId, int candyId, int userId) {
		super();
		this.recipeId = recipeId;
		this.candyId = candyId;
		this.userId = userId;
	}
	public Cooking() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int recipeId;
	private int candyId;
	private int userId;
	public int getRecipeId() {
		return recipeId;
	}
	public void setRecipeId(int recipeId) {
		this.recipeId = recipeId;
	}
	public int getCandyId() {
		return candyId;
	}
	public void setCandyId(int candyId) {
		this.candyId = candyId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "Cooking [recipeId=" + recipeId + ", candyId=" + candyId + ", userId=" + userId + "]";
	}
}
