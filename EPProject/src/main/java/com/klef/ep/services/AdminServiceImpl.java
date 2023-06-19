package com.klef.ep.services;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.klef.ep.models.Admin;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class AdminServiceImpl implements AdminService
{

	@Override
	public String checklogin(int id, String pwd) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("qms");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();
	    
	    
	    entityManager.getTransaction().begin();
	    Query qry=entityManager.createQuery("select u from Admin u where admin_id=? and  admin_password=?");
	    qry.setParameter(1, id);
	    qry.setParameter(2, pwd);
	    
	    Admin u = null;
	    
	    if (qry.getResultList().size()==1) 
	    {
	    	u = (Admin) qry.getSingleResult();
	    }
	    
	    entityManager.getTransaction().commit();
	    
	    entityManager.close();
	    entityManagerFactory.close();
	    
	    return "login success";
	}


}
