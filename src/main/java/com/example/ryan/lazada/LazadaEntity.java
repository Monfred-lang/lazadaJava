package com.example.ryan.lazada;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class LazadaEntity implements Serializable {
	
	@javax.persistence.Id
	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;
	
	public LazadaEntity() {
		
	}
	
	
	
	public LazadaEntity(Long id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public String toString() {
		return "LazadaEntity [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
	
	

}
