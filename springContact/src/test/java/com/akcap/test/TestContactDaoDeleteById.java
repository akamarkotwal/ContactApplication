package com.akcap.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.akcap.configu.SpringRootConfig;
import com.akcap.dao.ContactDAO;

public class TestContactDaoDeleteById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringRootConfig.class);
		ContactDAO dao=context.getBean(ContactDAO.class);
		dao.delete(3);
		System.out.println("value is deleted");

	}

}
