package com.klef.ep.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "participant")
public class Participant implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
	private int p_id;
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_email() {
		return p_email;
	}
	public void setP_email(String p_email) {
		this.p_email = p_email;
	}
	public String getP_password() {
		return p_password;
	}
	public void setP_password(String p_password) {
		this.p_password = p_password;
	}
	public String getP_role() {
		return p_role;
	}
	public void setP_role(String p_role) {
		this.p_role = p_role;
	}
	public String getP_stream() {
		return p_stream;
	}
	public void setP_stream(String p_stream) {
		this.p_stream = p_stream;
	}
	private String p_name;
	private String p_email;
	private String p_password;
	private String p_role;
	private String p_stream;
	
}
