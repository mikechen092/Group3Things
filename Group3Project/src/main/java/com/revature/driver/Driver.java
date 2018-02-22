package com.revature.driver;

import com.revature.beans.User;
import com.revature.dao.UserDao;
import com.revature.dao.UserDaoImpl;

public class Driver {
	
	public static void main(String [] args) {
		System.out.print("fjdklfd");
		User user = new User("test","test","test","test","user");
		UserDao ud = new UserDaoImpl();
		ud.addUser(user);
	}

}
