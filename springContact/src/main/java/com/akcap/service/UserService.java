package com.akcap.service;

import java.util.List;

import com.akcap.domain.User;
import com.akcap.exception.UserBlockException;

public interface UserService {
	public static final Integer LOGIN_STATUS_ACTIVE=1;
	public static final Integer LOGIN_STATUS_BLOCKED=2;
	public void registar(User u);
	//the method handled the login operation using givin creditional,
	//it return user object when success and null when failed
	//when useraccount is block then it throw UserBlockException
	public User login(String loginName,String password) throws UserBlockException;
		
	/*
	 * call this method when you need list of user		
	 */			
	public List<User> getUserList();		
	
	/*
	 * This method change the user login status for detailes passed as argument
	 * */
	
	public void changeLoginStatus(Integer userId,Integer loginStatus);
	

}
