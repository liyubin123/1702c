package com.liyubin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liyubin.entity.User;
import com.liyubin.service.Myservice;
import com.liyubin.utils.Utils;

@Controller
public class Mycontroller {
@Autowired
private Myservice ms; 



@RequestMapping("add1.do")
public Object add1(){
	List<User> list = Utils.add1();
	System.out.println(list);
	int num=ms.add1(list);
	System.out.println(num);
	return "redirect:list.do";
}
@RequestMapping("list.do")
public Object list(Model model){
	List<User> list=ms.list();
	model.addAttribute("list", list);
	return "list";
}





}
