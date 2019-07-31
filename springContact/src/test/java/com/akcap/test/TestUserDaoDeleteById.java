package com.akcap.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.akcap.configu.SpringRootConfig;
import com.akcap.dao.UserDAO;

public class TestUserDaoDeleteById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ct=new AnnotationConfigApplicationContext(SpringRootConfig.class);
		UserDAO dao=ct.getBean(UserDAO.class);
		dao.delete("raju");
	
		System.out.println("---------data is delete--------- ");

	}

}
