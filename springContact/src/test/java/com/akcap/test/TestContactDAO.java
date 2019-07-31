package com.akcap.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.akcap.configu.SpringRootConfig;
import com.akcap.dao.ContactDAO;
import com.akcap.domain.Contact;

public class TestContactDAO {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringRootConfig.class);
		ContactDAO contactDAO=context.getBean(ContactDAO.class);
		Contact contact=new Contact();
		contact.setUserId(16);
		contact.setName("vinayak");
		contact.setPhone("8446433121");
		contact.setEmail("vinayak@gmail.com");
		contact.setAddress("mumbai");
		contact.setRemarks("this is small man");
		contactDAO.save(contact);
		System.out.println("data is saved");
	}

}
