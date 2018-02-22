package com.revature.dao;

import java.util.List;

import com.revature.beans.Candy;

public interface CandyDao {
	
	public Candy getCandyById(int id);
	public List<Candy> getCandy();
	public int addCandy(Candy candy);
	public void deleteCandy(Candy candy);
	
}
