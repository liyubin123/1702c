package com.liyubin.dao;



import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.liyubin.entity.User;



public interface Dao {



	int add1(@Param("list")List list);

	List<User> list();

}
