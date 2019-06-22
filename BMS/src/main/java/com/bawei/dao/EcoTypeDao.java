package com.bawei.dao;

import java.util.List;

import com.bawei.entity.EcoType;

public interface EcoTypeDao {
	
	public Integer add(EcoType ecoType);
	
	public List<EcoType> list();
}
