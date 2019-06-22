package com.bawei.dao;

import java.util.List;

import com.bawei.entity.Company;

public interface CompanyDao {
	
	public Integer add(Company company);
	
	public List<Company> list();
	
	public List<Company> findByyouxian();
	
	public List<Company> findByGuFen();
	
	public List<Company> findByGuQi();
	
	public List<Company> findByOther();
	
	public List<Company> findBylittleFunds();
	
	public List<Company> findBymiddleFunds();
	
	public List<Company> findBybigFunds();
}
