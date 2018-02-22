package com.revature.dao;

import java.util.List;

import com.revature.beans.Recipe;

public interface RecipeDao {
	
	public List<Recipe> getRecipes();
	public Recipe getRecipeById(int id);
	public int addRecipe(Recipe recipe);

}
