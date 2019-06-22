package com.bawei.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bawei.dao.CompanyDao;
import com.bawei.entity.Company;
import com.bawei.service.CompanyService;


@Service("companyService")
public class CompanyServiceImpl implements CompanyService {
	
	@Resource
	private CompanyDao companyDao;
	
	
	@Override
	public Integer add(Company company) {
		// TODO Auto-generated method stub
		return companyDao.add(company);
	}


	@Override
	public List<Company> list() {
		// TODO Auto-generated method stub
		return companyDao.list();
	}


	@Override
	public List<Company> findByyouxian() {
		// TODO Auto-generated method stub
		return companyDao.findByyouxian();
	}


	@Override
	public List<Company> findByGuFen() {
		// TODO Auto-generated method stub
		return companyDao.findByGuFen();
	}


	@Override
	public List<Company> findByGuQi() {
		// TODO Auto-generated method stub
		return companyDao.findByGuQi();
	}


	@Override
	public List<Company> findByOther() {
		// TODO Auto-generated method stub
		return companyDao.findByOther();
	}


	@Override
	public List<Company> findBylittleFunds() {
		// TODO Auto-generated method stub
		return companyDao.findBylittleFunds();
	}


	@Override
	public List<Company> findBymiddleFunds() {
		// TODO Auto-generated method stub
		return companyDao.findBymiddleFunds();
	}


	@Override
	public List<Company> findBybigFunds() {
		// TODO Auto-generated method stub
		return companyDao.findBybigFunds();
	}

}
