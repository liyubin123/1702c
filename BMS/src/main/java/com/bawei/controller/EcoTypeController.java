package com.bawei.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bawei.entity.EcoType;
import com.bawei.service.EcoTypeService;
import com.bawei.util.StringUtil;

@Controller
@RequestMapping("/ecotype")
public class EcoTypeController {
	
	@Resource
	private EcoTypeService ecoTypeService;
	
	@RequestMapping("/save")
	public String save(){
		
		String[] ecoTypeName = StringUtil.getEcoType();
		for (String type : ecoTypeName) {
			EcoType ecoType = new EcoType();
			ecoType.setEcoTypeName(type);
			ecoTypeService.add(ecoType);
		}
		
		return "redirect:/index.jsp";
	}
	
	
}
