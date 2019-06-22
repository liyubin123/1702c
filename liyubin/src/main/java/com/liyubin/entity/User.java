package com.liyubin.entity;

public class User {
private int id;
private String bname;
private long rmb;
private long rs;
private String ss;
private int bid;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public long getRmb() {
	return rmb;
}
public void setRmb(long rmb) {
	this.rmb = rmb;
}
public long getRs() {
	return rs;
}
public void setRs(long rs) {
	this.rs = rs;
}
public String getSs() {
	return ss;
}
public void setSs(String ss) {
	this.ss = ss;
}
public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public User(int id, String bname, long rmb, long rs, String ss, int bid) {
	super();
	this.id = id;
	this.bname = bname;
	this.rmb = rmb;
	this.rs = rs;
	this.ss = ss;
	this.bid = bid;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "User [id=" + id + ", bname=" + bname + ", rmb=" + rmb + ", rs=" + rs + ", ss=" + ss + ", bid=" + bid + "]";
}

}
