package com.klef.ep.services;

import java.sql.PreparedStatement;
import java.util.List;


import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.klef.ep.models.Contest;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class ContestServiceImpl implements ContestService
{

	public String insertContest(Contest c) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("qms");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();
	    
	    
	    entityManager.getTransaction().begin();
	    entityManager.persist(c);
	    entityManager.getTransaction().commit();
	    
	    entityManager.close();
	    entityManagerFactory.close();
	    
	    return "Object Inserted Successfully";
	}

	public List<Contest> viewallContests() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("qms");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();
	    
	    
	    entityManager.getTransaction().begin();
	    Query qry=entityManager.createQuery("select c from Contest c");
	    List<Contest> contestlist=qry.getResultList();
	    entityManager.getTransaction().commit();
	    
	    entityManager.close();
	    entityManagerFactory.close();
	    
	    return contestlist;
	}
	@Override
	public String deleteContests(int c_id) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("qms");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();
	    
	    
	    entityManager.getTransaction().begin();
	    Contest e=entityManager.find(Contest.class,c_id);
	    entityManager.remove(e);
	    entityManager.getTransaction().commit();
	    
	    entityManager.close();
	    entityManagerFactory.close();
	    
	    return "Contest deleted Successfully";
		
	}

	@Override
	public Contest viewContestByName(String c_name) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("qms");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();
	    
	    
	    entityManager.getTransaction().begin();
	    Query qry=entityManager.createQuery("select c from Contest c where contest_name=?");
	    qry.setParameter(0, c_name);
	    Contest c=(Contest) qry.getResultList();
	    entityManager.getTransaction().commit();
	    
	    entityManager.close();
	    entityManagerFactory.close();
		return c;
	}
	
}
