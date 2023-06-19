package com.klef.ep.services;

import javax.ejb.Remote;

import com.klef.ep.models.Admin;


@Remote
public interface AdminService {
	public String checklogin(int id,String pwd);
}
