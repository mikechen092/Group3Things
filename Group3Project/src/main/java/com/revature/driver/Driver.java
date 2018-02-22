package com.revature.driver;

import com.revature.beans.User;
import com.revature.dao.UserDao;
import com.revature.dao.UserDaoImpl;

public class Driver {
	
	public static void main(String [] args) {
		User user = new User("username","password","Test","McTester","user@user.user");
		UserDao ud = new UserDaoImpl();
		ud.addUser(user);
	}

}
