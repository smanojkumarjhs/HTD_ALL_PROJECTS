package com.qapitol.model;
public class Address {
    private String streetName;
    private String completeAddress;
    private String pincode;

   
    public String getStreetName() {
        return streetName;
    }
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCompleteAddress() {
        return completeAddress;
    }
    public void setCompleteAddress(String completeAddress) {
        this.completeAddress = completeAddress;
    }

    public String getPincode() {
        return pincode;
    }
    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}
