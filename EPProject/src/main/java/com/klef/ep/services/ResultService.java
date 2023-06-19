package com.klef.ep.services;

import java.util.List;

import javax.ejb.Remote;

import com.klef.ep.models.Result;

@Remote
public interface ResultService 
{	
	public String insert(Result r);
	public List<Result> viewResult();
	public List<Result> viewResultByCId(int c_id);
}
