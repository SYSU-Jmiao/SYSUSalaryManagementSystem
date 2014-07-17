package com.sms.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sms.dao.IFinalBonusDao;
import com.sms.entity.FinalBonus;

public class FinalBonusDaoImp implements IFinalBonusDao{
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void addFinalBonus(FinalBonus finalBonus) {
		// TODO Auto-generated method stub
		getSession().clear();
		getSession().save(finalBonus);
	}

	@Override
	public void deleteFinalBonus(FinalBonus finalBonus) {
		// TODO Auto-generated method stub
		getSession().clear();
		getSession().delete(finalBonus);
	}

	@Override
	public void modifyFinalBonus(FinalBonus finalBonus) {
		// TODO Auto-generated method stub
		getSession().clear();
		getSession().update(finalBonus);
	}

	@Override
	public List<FinalBonus> findFinalBonusByEId(Integer eId) {
		// TODO Auto-generated method stub
		Query query = (Query)getSession().createQuery("from FinalBonus where eId = ?");
		query.setString(0, eId.toString());	
		return (List<FinalBonus>)query.list();
	}

}
