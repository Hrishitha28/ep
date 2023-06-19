package com.klef.ep.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="result")
public class Result implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
	private int r_id;
	public int getR_id() {
		return r_id;
	}
	public void setR_id(int r_id) {
		this.r_id = r_id;
	}
	public int getParticipant_id() {
		return participant_id;
	}
	public void setParticipant_id(int participant_id) {
		this.participant_id = participant_id;
	}
	public int getContest_id() {
		return contest_id;
	}
	public void setContest_id(int contest_id) {
		this.contest_id = contest_id;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	private int participant_id;
	private String participant_email;
	public String getParticipant_email() {
		return participant_email;
	}
	public void setParticipant_email(String participant_email) {
		this.participant_email = participant_email;
	}
	public String getParticipat_name() {
		return participat_name;
	}
	public void setParticipat_name(String participat_name) {
		this.participat_name = participat_name;
	}
	private String participat_name;
	private int contest_id;
	private int score;
	
}
