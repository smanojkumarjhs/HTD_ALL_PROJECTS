package com.qapitol.fileHandling;

import java.util.LinkedList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

public class Controller {
	public static void main(String[] args) throws JsonProcessingException  {
		Student1 student = new Student1();
		Address2 address1 = new Address2();
		Address2 address2 = new Address2();

		address1.setArea("JP nagar");
		address1.setLandmark("Gopalan innovation");
		address1.setPincode(560055);
		address2.setArea("BTM");
		address2.setLandmark("Qapitol");
		address2.setPincode(560088);

		List<Address2> addressList = new LinkedList<Address2>();
		addressList.add(address1);
		addressList.add(address2);
		student.setName("Vaib");
		student.setId(1);
		student.setMobno(987654310);
		student.setAddress2(addressList);
		System.out.println("Student details");
	/*	ObjectMapper mapper = new ObjectMapper();
		String s = mapper.writeValueAsString(student);
		System.out.println(s); */
		 ObjectMapper mapper =new ObjectMapper(new YAMLFactory());
		 String s = mapper.writeValueAsString(student);
		 System.out.println(s); 
	}
}