package com.revature.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.revature.domain.Animal;
import com.revature.domain.Bear;
import com.revature.util.HibernateUtil;

public class BearDaoImpl implements BearDao {

	@Override
	public List<Bear> getBears() {
		Session s = HibernateUtil.getSession();
		List<Bear> bears = s.createQuery("from Bear").list();
		for (Bear f : bears) {
			System.out.println(f);
		}
		s.close();
		return bears;
	}

	@Override
	public Bear getBearById(int id) {
		Session s = HibernateUtil.getSession();
		Bear b = (Bear) s.get(Bear.class, id);
		s.close();
		return b;
	}

	@Override
	public void addBears(List<Bear> bearList) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		for (Bear b : bearList) {
			s.persist(b);
		}
		tx.commit();
		s.close();
	}

	@Override
	public List<Bear> getGBears() {
		Session s = HibernateUtil.getSession();
		Criteria c = s.createCriteria(Bear.class);
		List<Bear> listBear = c.add(Restrictions.like("name","G%")).list();
		
		return listBear;
		
	}

	@Override
	public Long getNumBears() {
		Session s = HibernateUtil.getSession();
		Criteria c = s.createCriteria(Bear.class);
		Long result = (Long) c.setProjection(Projections.rowCount()).uniqueResult();
		return result;
	}

}











