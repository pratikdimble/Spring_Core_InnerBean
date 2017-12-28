package com.app.entity;

import java.util.Set;

public class Employee {

	private int eid;
	private String ename;
	private Set<Integer> data;
	private Address addr;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public Set<Integer> getData() {
		return data;
	}
	public void setData(Set<Integer> data) {
		this.data = data;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", data=" + data + ", addr=" + addr + "]";
	}
}
