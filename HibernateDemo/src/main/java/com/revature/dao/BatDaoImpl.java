package com.revature.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.revature.domain.Bat;
import com.revature.util.HibernateUtil;

public class BatDaoImpl implements BatDao {
	
	@Override
	public List<Bat> getBats() {
		Session s = HibernateUtil.getSession();
		List<Bat> bats = s.createQuery("from Bat").list();
		for (Bat f : bats) {
			System.out.println(f);
		}
		s.close();
		return bats;
	}

	@Override
	public Bat getBatById(int id) {
		Session s = HibernateUtil.getSession();
		Bat b = (Bat) s.get(Bat.class, id);
		s.close();
		return b;
	}

	@Override
	public void addBats(List<Bat> batList) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		for (Bat b : batList) {
			s.persist(b);
		}
		tx.commit();
		s.close();
	}

	@Override
	public List<Bat> getWingspanBat() {
		Session s = HibernateUtil.getSession();
		Criteria c = s.createCriteria(Bat.class);
		
		List<Bat> listBat = c.add(Restrictions.between("wingspan",50,100)).list();
		return listBat;
	}

	@Override
	public Long getTotalWingspan() {
		Session s = HibernateUtil.getSession();
		Criteria c = s.createCriteria(Bat.class);
		Long result = (Long)c.setProjection(Projections.sum("wingspan")).uniqueResult();
		return result;
	}

}
