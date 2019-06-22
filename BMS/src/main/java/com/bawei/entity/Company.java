package com.bawei.entity;

public class Company {
	
	private Integer id;
	private String GSName;
	private Long GSFunds;
	private Long GSPeople;
	private String GSMarket;
	private String GSEcoType;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGSName() {
		return GSName;
	}
	public void setGSName(String gSName) {
		GSName = gSName;
	}
	public Long getGSFunds() {
		return GSFunds;
	}
	public void setGSFunds(Long gSFunds) {
		GSFunds = gSFunds;
	}
	public Long getGSPeople() {
		return GSPeople;
	}
	public void setGSPeople(Long gSPeople) {
		GSPeople = gSPeople;
	}
	public String getGSMarket() {
		return GSMarket;
	}
	public void setGSMarket(String gSMarket) {
		GSMarket = gSMarket;
	}
	public String getGSEcoType() {
		return GSEcoType;
	}
	public void setGSEcoType(String gSEcoType) {
		GSEcoType = gSEcoType;
	}
	@Override
	public String toString() {
		return "Company [id=" + id + ", GSName=" + GSName + ", GSFunds=" + GSFunds + ", GSPeople=" + GSPeople
				+ ", GSMarket=" + GSMarket + ", GSEcoType=" + GSEcoType + "]";
	}
	public Company(Integer id, String gSName, Long gSFunds, Long gSPeople, String gSMarket, String gSEcoType) {
		super();
		this.id = id;
		GSName = gSName;
		GSFunds = gSFunds;
		GSPeople = gSPeople;
		GSMarket = gSMarket;
		GSEcoType = gSEcoType;
	}
	public Company() {
		super();
	}
	public Company(String gSName, Long gSFunds, Long gSPeople, String gSMarket, String gSEcoType) {
		super();
		GSName = gSName;
		GSFunds = gSFunds;
		GSPeople = gSPeople;
		GSMarket = gSMarket;
		GSEcoType = gSEcoType;
	}
	
	
	
	
	
}
