package com.revature.dao;

import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Candy;
import com.revature.util.HibernateUtil;

public class CandyDaoImpl implements CandyDao{
	
	@Override
	public Candy getCandyById(int id) {
		Session s = HibernateUtil.getSession();
		Candy candy = (Candy) s.get(Candy.class, id);
		s.close();
		return candy;
	};
	
	@Override
	public List<Candy> getCandy(){
		Session s = HibernateUtil.getSession();
		List<Candy> candies = s.createQuery("from Candy").list();
		return candies;
	};
	
	@Override
	public int addCandy(Candy candy) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		int result = 0;
		s.persist(candy);
		tx.commit();
		s.close();
		return result;
	};
	
	@Override
	public void deleteCandy(Candy candy) {
		Session s = HibernateUtil.getSession();
		s.delete(candy);
		s.close();
	};
	
}
