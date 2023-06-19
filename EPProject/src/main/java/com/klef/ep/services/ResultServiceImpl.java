package com.klef.ep.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.klef.ep.models.Contest;
import com.klef.ep.models.Result;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class ResultServiceImpl implements ResultService
{

	public String insert(Result r) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("qms");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();
	    
	    
	    entityManager.getTransaction().begin();
	    entityManager.persist(r);
	    entityManager.getTransaction().commit();
	    
	    entityManager.close();
	    entityManagerFactory.close();
	    
	    return "Object Inserted Successfully";
	}

	public List<Result> viewResult() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("qms");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();
	    
	    
	    entityManager.getTransaction().begin();
	    Query qry=entityManager.createQuery("select r from Result r");
	    List<Result> resultlist=qry.getResultList();
	    entityManager.getTransaction().commit();
	    
	    entityManager.close();
	    entityManagerFactory.close();
	    
	    return resultlist;
	}

	public List<Result> viewResultByCId(int c_id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("qms");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();
	    
	    
	    entityManager.getTransaction().begin();
	    Query qry=entityManager.createQuery("select r from Result r where contest_id=? ORDER BY score DESC");
	    qry.setParameter(1, c_id);
	    List<Result> result=(List<Result>) qry.getResultList();
	    entityManager.getTransaction().commit();
	    
	    entityManager.close();
	    entityManagerFactory.close();
	    
	    return result;
	}
	
}
