package com.bridgelabz.basicprogramming;

import com.bridgelabz.utility.Util;
public class Hello {
	private String name;
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
public static void main(String[] args)
 {
	String str=Util.replace("deepika");
	System.out.println("the replaced string is:"+str);

	}

}
