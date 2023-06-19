package com.klef.ep.services;

import javax.ejb.Remote;

import com.klef.ep.models.Participant;

@Remote
public interface ParticipantService {
	public String participantreg(Participant p);
	public Participant participantlogin(String email,String password);
}
