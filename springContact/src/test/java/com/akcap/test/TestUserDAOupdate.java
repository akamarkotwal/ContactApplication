package com.akcap.test;

import java.text.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.akcap.configu.SpringRootConfig;
import com.akcap.dao.UserDAO;
import com.akcap.domain.User;

public class TestUserDAOupdate {
	public static void main(String[] args) {
		ApplicationContext ct=new AnnotationConfigApplicationContext(SpringRootConfig.class);
		UserDAO dao=ct.getBean(UserDAO.class);
		//the user detailes is taken from registration form
		User u=new User();
		u.setUserId(15);
		u.setName("amar ");
		u.setPhone("985051552");
		u.setEmail("akamar@gmail.com");
		u.setAddress("beed");
		u.setRole(1);
		u.setLoginStatus(1);
		dao.update(u);
		System.out.println("---------data is update--------- ");
		 
	}

}
