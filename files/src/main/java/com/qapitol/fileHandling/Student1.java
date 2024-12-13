package com.qapitol.fileHandling;

import java.util.List;

public class Student1 {
	private String name;
	private int id;
	private long mobno;
    List<Address2> address2;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getMobno() {
		return mobno;
	}

	public void setMobno(long mobno) {
		this.mobno = mobno;
	}

	public List<Address2> getAddress2() {
		return address2;
	}

	public void setAddress2(List<Address2> address2) {
		this.address2 = address2;
	}

	@Override
	public String toString() {
		return "Student{" + "name='" + name + '\'' + ", id=" + id + ", mobno=" + mobno + ", address=" + address2 + '}';
	}
}