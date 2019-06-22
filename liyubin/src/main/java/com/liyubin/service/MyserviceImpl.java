package com.liyubin.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.liyubin.dao.Dao;
import com.liyubin.entity.User;

@Service
public class MyserviceImpl implements Myservice{
@Autowired
private Dao da;

@Override
public int add1(List list) {
	// TODO Auto-generated method stub
	return da.add1(list);
}

@Override
public List<User> list() {
	// TODO Auto-generated method stub
	return da.list();
}




}
