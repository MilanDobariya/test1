package com.phone;

public class OperatingSystemFactory {
	public os getInstance(String str)
	{
		if(str.equals("open"))
			return new Android();
		else if(str.equals("closed"))
			return new Iphone();
		else
			return new Windows();
				
	}
}
