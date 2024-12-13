package Associations;

public class Passport {

	private String pNumber;
	private String address;

	public String getpNumber() {
		return pNumber;
	}

	public void setpNumber(String pNumber) {
		this.pNumber = pNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Passport [pNumber=" + pNumber + ", address=" + address + "]";
	}

}
