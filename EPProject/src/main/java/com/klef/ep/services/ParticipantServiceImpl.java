package com.klef.ep.services;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.klef.ep.models.Admin;
import com.klef.ep.models.Participant;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class ParticipantServiceImpl implements ParticipantService
{

	public String participantreg(Participant p) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("qms");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();
	    
	    
	    entityManager.getTransaction().begin();
	    entityManager.persist(p);
	    entityManager.getTransaction().commit();
	    
	    entityManager.close();
	    entityManagerFactory.close();
	    
	    return "User Registered Successfully";
	}

	@Override
	public Participant participantlogin(String email, String password) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("qms");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();
	    
	    
	    entityManager.getTransaction().begin();
	    Query qry=entityManager.createQuery("select p from Participant p where p_email=? and  p_password=?");
	    qry.setParameter(1, email);
	    qry.setParameter(2, password);
	    
	    Participant p = null;
	    
	    if (qry.getResultList().size()==1) 
	    {
	    	p = (Participant) qry.getSingleResult();
	    }
	    
	    entityManager.getTransaction().commit();
	    
	    entityManager.close();
	    entityManagerFactory.close();
	    
	    return p;
	}
	
}
