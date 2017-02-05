package com.test.ser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SeriManager {
    public static void main(String[] args)throws FileNotFoundException,IOException, ClassNotFoundException {
		
        /* Customer c = new Customer();
         c.setName("Abc");
         c.setEmail("abc@email.com");
         c.setAge("30");
         c.setPassword1("password1");
         c.setPassword2("password2");
         
         File file = new File("customer.txt");
         
         try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(c);
			
			oos.close();
			
			System.out.println("Object Saved successfully...");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw e;
		}
         catch (IOException e) {
 			e.printStackTrace();
 			throw e;
 		}*/
         
    	File file = new File("customer.txt");
    	FileInputStream fis = new FileInputStream(file);
    	ObjectInputStream ois = new ObjectInputStream(fis);
    	Customer cust = (Customer)ois.readObject();
    	
    	ois.close();
    	
    	System.out.println(cust.getName());
    	System.out.println(cust.getAge());
    	System.out.println(cust.getEmail());
    	System.out.println(cust.getPassword1());
    	System.out.println(cust.getPassword2());
    	
    	
         
	}
}
