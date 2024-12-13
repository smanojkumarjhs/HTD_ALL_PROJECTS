package Associations;

import java.util.List;

public class Employee {
	private int id;
	private String name;
	private Passport passport;
	private List<Address> listOfAddress;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	public List<Address> getListOfAddress() {
		return listOfAddress;
	}

	public void setListOfAddress(List<Address> listOfAddress) {
		this.listOfAddress = listOfAddress;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", passport=" + passport + ", listOfAddress=" + listOfAddress
				+ "]";
}
}
