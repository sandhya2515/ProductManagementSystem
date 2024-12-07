package com.user;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.config.HibernateUtil;
import com.model.Product;

public class Test 
{
  public void insertData()
  {
	  SessionFactory sf=HibernateUtil.getSessionFactory();
	  Session ss=sf.openSession();
	  Transaction t=ss.beginTransaction();
	  
	  Product p=new Product();
	  p.setId(1);
	  p.setName("Laptop");
	  p.setPrice(65000);
	  p.setCategory("A");
	  
	  ss.persist(p);
	  t.commit();
  }
	public static void main(String[] args)
	{
		Test t= new Test();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your choice 1.insertdata /n 2. viewdata /n 3. updatedata /4. deletedata");
		int x=s.nextInt();
		switch(x)
		{
		case 1:
			t.insertData();
			break;
		}


	}

}
