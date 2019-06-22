package com.bawei.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bawei.dao.EcoTypeDao;
import com.bawei.entity.EcoType;
import com.bawei.service.EcoTypeService;


@Service("ecoTypeService")
public class EcoTypeServiceImpl implements EcoTypeService {
	
	@Resource
	private EcoTypeDao ecoTypeDao;
	
	@Override
	public Integer add(EcoType ecoType) {
		return ecoTypeDao.add(ecoType);
	}

	@Override
	public List<EcoType> list() {
		// TODO Auto-generated method stub
		return ecoTypeDao.list();
	}

}
