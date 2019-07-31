package com.akcap.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.akcap.configu.SpringRootConfig;
import com.akcap.dao.ContactDAO;
import com.akcap.domain.Contact;

public class TestContactDAOFindByProperty {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringRootConfig.class);
		ContactDAO dao=context.getBean(ContactDAO.class);
		List<Contact> contacts= dao.findByProperty("address", "mumbai");
		for(Contact c:contacts) {
			System.out.println(" user deatiales\n ");
	          System.out.println(c.getContactId());
	          System.out.println(c.getUserId());
	          System.out.println(c.getName());
	          System.out.println(c.getPhone());
	          System.out.println(c.getAddress());
	          System.out.println(c.getRemarks());
		}

	}

}
