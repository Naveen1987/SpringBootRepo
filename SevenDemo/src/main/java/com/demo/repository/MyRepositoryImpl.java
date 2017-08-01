package com.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.demo.models.Employees;

@Repository //Optional
@Transactional //Optional
public class MyRepositoryImpl implements MyRepositoryCustom {

	@PersistenceContext //Compalsory
	EntityManager em;
	@Override
	public Employees getEmp(int eid,String ename) {
		Query q=em.createQuery("from Employees where eid=:eid and ename=:ename");
		q.setParameter("eid", eid);
		q.setParameter("ename", ename);
		List<Employees> l=q.getResultList();
//		System.out.println(l);
		if(l.size()>0)
		return l.get(0);
		else
		return null;
	}

}
