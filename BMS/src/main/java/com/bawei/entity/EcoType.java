package com.bawei.entity;

public class EcoType {
	private Integer EcoId;
	private String EcoTypeName;
	public Integer getEcoId() {
		return EcoId;
	}
	public void setEcoId(Integer ecoId) {
		EcoId = ecoId;
	}
	public String getEcoTypeName() {
		return EcoTypeName;
	}
	public void setEcoTypeName(String ecoTypeName) {
		EcoTypeName = ecoTypeName;
	}
	@Override
	public String toString() {
		return "EcoType [EcoId=" + EcoId + ", EcoTypeName=" + EcoTypeName + "]";
	}
	public EcoType(Integer ecoId, String ecoTypeName) {
		super();
		EcoId = ecoId;
		EcoTypeName = ecoTypeName;
	}
	public EcoType() {
		super();
	}
	public EcoType(String ecoTypeName) {
		super();
		EcoTypeName = ecoTypeName;
	}
	
}
