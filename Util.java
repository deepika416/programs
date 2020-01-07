package com.bridgelabz.utility;

public class Util {

	public static String replace(String name) {
		String s2=null;
		String s1="hello username.how are you?";
		s2=s1.replaceAll("username",name);
		return s2;
	}

}
