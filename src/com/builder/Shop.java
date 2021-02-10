package com.builder;

public class Shop {
	public static void main(String[] args)
	{
		Phone p=new PhoneBuilder().setOs("android").setRam(2).setBattery(3100).setProcessor("dual").getPhone();
		System.out.println(p);
	}
}
