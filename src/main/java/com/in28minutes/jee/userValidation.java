package com.in28minutes.jee;

public class userValidation {
	public boolean isVAlid(String name, String password){
		if(name.equals("hiba") && password.equals("pass"))
			return true;
		return false;
	}
}
