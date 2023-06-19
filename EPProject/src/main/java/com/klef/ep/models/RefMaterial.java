package com.klef.ep.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RefMaterial")
public class RefMaterial implements Serializable 
{
	private static final long serialVersionUID = 1L;
	
	@Id
	private int material_id;
	public int getMaterial_id() {
		return material_id;
	}
	public void setMaterial_id(int material_id) {
		this.material_id = material_id;
	}
	public String getMaterial_description() {
		return material_description;
	}
	public void setMaterial_description(String material_description) {
		this.material_description = material_description;
	}
	public String getReference_link() {
		return reference_link;
	}
	public void setReference_link(String reference_link) {
		this.reference_link = reference_link;
	}
	private String material_description;
	private String reference_link;
}
