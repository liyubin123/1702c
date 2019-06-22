package com.bawei.service;

import java.util.List;

import com.bawei.entity.EcoType;

public interface EcoTypeService {
	
	public Integer add(EcoType ecoType);
	
	public List<EcoType> list();
}
