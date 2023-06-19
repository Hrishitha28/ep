package com.klef.ep.services;

import java.util.List;

import javax.ejb.Remote;

import com.klef.ep.models.Contest;


@Remote
public interface ContestService {
	public String insertContest(Contest c);
	public List<Contest> viewallContests();
	public Contest viewContestByName(String c_name);
	public String deleteContests(int c_id);
}
