package com.vinay.Telusko;

import java.util.Properties;

public class Customerc {
	private String name;
	private String contact;
	private Properties address;
	
	public Customerc(String name,String contact, Properties address) {
		this.name=name;
		this.contact=contact;
		this.address=address;
	}

	@Override
	public String toString() {
		return "Customerc [name=" + name + ", contact=" + contact + ", address=" + address + "]";
	}
	

}
