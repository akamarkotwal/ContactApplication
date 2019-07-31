package com.akcap.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.akcap.configu.SpringRootConfig;
import com.akcap.dao.ContactDAO;
import com.akcap.domain.Contact;

public class TestContactDAOFindSingleRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringRootConfig.class);
          ContactDAO dao=context.getBean(ContactDAO.class);
          Contact c=dao.findById(2);
          System.out.println("user deatiales");
          System.out.println(c.getContactId());
          System.out.println(c.getUserId());
          System.out.println(c.getName());
          System.out.println(c.getPhone());
          System.out.println(c.getAddress());
          System.out.println(c.getRemarks());
	}

}
