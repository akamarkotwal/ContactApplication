package com.akcap.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.akcap.configu.SpringRootConfig;
import com.akcap.dao.UserDAO;
import com.akcap.domain.User;

public class TestUserDAOFindByProperty {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringRootConfig.class);
		 UserDAO dao =ctx.getBean(UserDAO.class);
		List<User> users= dao.findByProperty("role", 1);
		for(User u:users) {
			System.out.println("\n user deatiales ");
			System.out.println(u.getUserId());
			System.out.println(u.getName());
			System.out.println(u.getPhone());
			System.out.println(u.getEmail());
			System.out.println(u.getAddress());
			System.out.println(u.getLoginName());
			System.out.println(u.getPassword());
			System.out.println(u.getRole());
			System.out.println(u.getLoginStatus());
		}
		
	}
}
