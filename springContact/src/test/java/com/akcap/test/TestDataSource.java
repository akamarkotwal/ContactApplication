package com.akcap.test;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.akcap.configu.SpringRootConfig;

public class TestDataSource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new AnnotationConfigApplicationContext(SpringRootConfig.class);
		DataSource ds=context.getBean(DataSource.class);
		JdbcTemplate jdbcTemplate=new JdbcTemplate(ds);
		String sql="INSERT INTO `user` ( `name`, `phone`, `email`, `address`, `loginName`, `password`) VALUES(?,?,?,?,?,?)";
		Object[] param=new Object[] {"raju", "9767356715" , "akamarkotwal@gmail.com" , "khed" , "raju", "admin" };
		jdbcTemplate.update(sql,param);
		System.out.println("sql excutaed");

	}

}
