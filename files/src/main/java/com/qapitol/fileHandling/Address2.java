package com.qapitol.fileHandling;

public class Address2 {
	private String area;
	private String landmark;
	private long pincode;

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address2{" + "area='" + area + '\'' + ", landmark='" + landmark + '\'' + ", pincode=" + pincode + '}';
	}
}