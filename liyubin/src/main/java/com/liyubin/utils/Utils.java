package com.liyubin.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.liyubin.entity.User;

public class Utils {

	public static List add1(){
		List<User> list=new ArrayList<User>();
		
		for (int i = 0; i < 5; i++) {
			User user=new User();
			String stu=Utils.getone();
			long rmb=Utils.gettwo(100000,1000000000);
			int rs=Utils.getshan(100,500);
			String ss=Utils.getshi();
			int bid=Utils.getwu();
			user.setBname(stu);
			user.setRmb(rmb);
			user.setRs(rs);
			user.setSs(ss);
			user.setBid(bid);
			list.add(user);
		}
		return list;
	}

	private static int getwu() {
		// TODO Auto-generated method stub
		int[]  str={1,2,3,4,5};
		Random random = new Random();
		int a=Math.abs(random.nextInt(str.length));
		return str[a];
	}

	private static String getshi() {
		// TODO Auto-generated method stub
		String[] str={"已上市","未上市"};
		Random random = new Random();
		int a=Math.abs(random.nextInt(str.length));
		return str[a];
	}

	private static int getshan(int i, int j) {
		// TODO Auto-generated method stub
		int n=(int) ((Math.random()*(j-i))+i);
		return n;
	}

	private static long gettwo(long i, long j) {
		// TODO Auto-generated method stub
		long n=(long) ((Math.random()*(j-i))+i);
		return n;
	}

	private static String getone() {
		// TODO Auto-generated method stub
		String stu="北京";
		int n=Utils.getint(2,4);
		String i=Utils.getfirst(n);
		String u=Utils.getlast();
		return stu+i+u;
	}

	private static String getlast() {
		// TODO Auto-generated method stub
		String[] str={"有限公司","股份有限公司","集团有限公司"};
		Random random = new Random();
		int a=Math.abs(random.nextInt(str.length));
		return str[a];
	}

	private static int getint(int i, int j) {
		// TODO Auto-generated method stub
		int n=(int) ((Math.random()*(j-i))+i);
		return n;
	}

	private static String getfirst(int n) {
		// TODO Auto-generated method stub
		String[] str={"赵","钱","孙","李","周","吴","郑","王","冯",
				"陈","褚","卫","蒋","沈","韩","杨","朱","秦","尤","许","何",
				"吕","施","张","孔","曹","严","华"};
		String sta="";
		 	Random random = new Random();
		 	for (int i = 0; i <n; i++) {
				int a=Math.abs(random.nextInt(str.length));
				sta+=str[a];
			}
		return sta;
	}
}
