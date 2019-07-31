package com.akcap.test;

import java.text.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.akcap.configu.SpringRootConfig;
import com.akcap.dao.UserDAO;
import com.akcap.domain.User;

public class TestUserDAOsave {
	public static void main(String[] args) {
		ApplicationContext ct=new AnnotationConfigApplicationContext(SpringRootConfig.class);
		UserDAO dao=ct.getBean(UserDAO.class);
		//the user detailes is taken from registration form
		User u=new User();
		u.setName("raju");
		u.setPhone("9767356715");
		u.setEmail("raju@gmail.com");
		u.setAddress("pune");
		u.setLoginName("raju");
		u.setPassword("raju");
		u.setRole(1);
		u.setLoginStatus(1);
		dao.save(u);
		System.out.println("---------data is save--------- ");
		 
	}

}
