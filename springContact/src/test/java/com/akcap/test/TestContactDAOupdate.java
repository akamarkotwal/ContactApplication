package com.akcap.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.akcap.configu.SpringRootConfig;
import com.akcap.dao.ContactDAO;
import com.akcap.domain.Contact;
import com.akcap.domain.User;

public class TestContactDAOupdate {

	public static void main(String[] args) {
	  ApplicationContext context=new AnnotationConfigApplicationContext(SpringRootConfig.class);
	  ContactDAO dao=context.getBean(ContactDAO.class);
	Contact c=new Contact();
	c.setContactId(2);
	c.setName("Rahul");
	c.setPhone("9860186038");
	c.setEmail("rahul@gmail.com");
	c.setAddress("mumbai");
	c.setRemarks("this is slim man");
	dao.update(c);
	System.out.println("data is updated");
	  

	}

}
