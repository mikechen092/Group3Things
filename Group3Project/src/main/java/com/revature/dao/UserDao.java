package com.revature.dao;

import java.util.List;

import com.revature.beans.User;

public interface UserDao {
	
	public User getUserById(int id);
	public List<User> getUsers();
	public User getUserByUsername(String username);
	public int addUser(User user);
	public void deleteUser(User user);
	

}
