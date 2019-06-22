package com.bawei.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bawei.entity.Company;
import com.bawei.entity.EcoType;
import com.bawei.service.CompanyService;
import com.bawei.service.EcoTypeService;
import com.bawei.util.RandomUtil;
import com.bawei.util.StringUtil;

@Controller
@RequestMapping("/company")
public class CompanyController {
	
	@Resource
	private CompanyService companyService;
	
	@Resource
	private EcoTypeService ecoTypeService;
	
	@RequestMapping("/save")
	public String save(){
		List<EcoType> ecoTypesList = ecoTypeService.list();
		String[] ecotypeArray = new String[ecoTypesList.size()];
		
		for(int i=0;i<ecoTypesList.size();i++){
			ecotypeArray[i] = ecoTypesList.get(i).getEcoTypeName();
		}
		for(int i=0;i<5;i++){
			Company company = new Company();
			company.setGSName(StringUtil.getName());
			company.setGSFunds(RandomUtil.getRandomNum(100000, 1000000000));
			company.setGSPeople(RandomUtil.getRandomNum(20, 1000));
			if(RandomUtil.getRandomNum(5, 50)%2 == 0){
				company.setGSMarket("未上市");
			}else{
				company.setGSMarket("已上市");
			}
			
			company.setGSEcoType(RandomUtil.getEcoType(ecotypeArray));
			
			companyService.add(company);
			
		}
		
		return "index";
	}
	
	
	@RequestMapping("/list")
	public ModelAndView list(){
		List<Company> companyList = companyService.list();
		ModelAndView mav = new ModelAndView();
		mav.addObject("companyList", companyList);
		mav.setViewName("index");
		return mav;
	}
	
	
	@RequestMapping("/findByyouxian")
	public ModelAndView findByyouxian(){
		List<Company> companyList = companyService.findByyouxian();
		ModelAndView mav = new ModelAndView();
		mav.addObject("companyList", companyList);
		mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping("/findByGuFen")
	public ModelAndView findByGuFen(){
		List<Company> companyList = companyService.findByGuFen();
		ModelAndView mav = new ModelAndView();
		mav.addObject("companyList", companyList);
		mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping("/findByGuQi")
	public ModelAndView findByGuQi(){
		List<Company> companyList = companyService.findByGuQi();
		ModelAndView mav = new ModelAndView();
		mav.addObject("companyList", companyList);
		mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping("/findByOther")
	public ModelAndView findByOther(){
		List<Company> companyList = companyService.findByOther();
		ModelAndView mav = new ModelAndView();
		mav.addObject("companyList", companyList);
		mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping("/findBylittleFunds")
	public ModelAndView findBylittleFunds(){
		List<Company> companyList = companyService.findBylittleFunds();
		ModelAndView mav = new ModelAndView();
		mav.addObject("companyList", companyList);
		mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping("/findBymiddleFunds")
	public ModelAndView findBymiddleFunds(){
		List<Company> companyList = companyService.findBymiddleFunds();
		ModelAndView mav = new ModelAndView();
		mav.addObject("companyList", companyList);
		mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping("/findBybigFunds")
	public ModelAndView findBybigFunds(){
		List<Company> companyList = companyService.findBybigFunds();
		ModelAndView mav = new ModelAndView();
		mav.addObject("companyList", companyList);
		mav.setViewName("index");
		return mav;
	}
}
