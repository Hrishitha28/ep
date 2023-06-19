package com.klef.ep.models;

import java.io.Serializable;
import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.servlet.http.Part;

@Entity
@Table(name="Contest")
public class Contest implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
	private int contest_id;
	public int getContest_id() {
		return contest_id;
	}
	public void setContest_id(int contest_id) {
		this.contest_id = contest_id;
	}
	public String getContest_name() {
		return contest_name;
	}
	public void setContest_name(String contest_name) {
		this.contest_name = contest_name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getContest_startdate() {
		return contest_startdate;
	}
	public void setContest_startdate(String contest_startdate) {
		this.contest_startdate = contest_startdate;
	}
	public String getContest_enddate() {
		return contest_enddate;
	}
	public void setContest_enddate(String contest_enddate) {
		this.contest_enddate = contest_enddate;
	}
	private String contest_name;
	private String Description;
	private String contest_startdate;
	private String contest_enddate;
//	private Blob image;
//	public Blob getImage() {
//		return image;
//	}
//	public void setImage(Part filePart) {
//		this.image = (Blob) filePart;
//	}
	
}
