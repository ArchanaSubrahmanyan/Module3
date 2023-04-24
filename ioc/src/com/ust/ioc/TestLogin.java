package com.ust.ioc;
 
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;

import org.springframework.core.io.FileSystemResource;



public class TestLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Login login = new Login();
//		login.setUserName("johndoe");
//		login.setPassword("winnyminny");
//		String result=login.validate();
//		System.out.println(result);
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("beans.xml"));
		//all beans are auto promoted to object type
		Object obj = factory.getBean("connection");
		Connection con = (Connection)obj; //get the object and convert to respective type
		System.out.println(obj);
		Object obj2= factory.getBean("login");
		Login login = (Login)obj2;
		login.validate();
	}

}
