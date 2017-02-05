package com.test.ser;

import java.io.Serializable;

public class Customer implements Serializable{
	

	private static final long serialVersionUID = -2737687582615950073L;

	private String name;
	private String email;
	private String age;
    private static String password1="defa1";
    private transient String password2="defaul2";
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public static String getPassword1() {
		return password1;
	}

	public static void setPassword1(String password1) {
		Customer.password1 = password1;
	}

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}
     
}
