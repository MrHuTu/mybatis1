package cn.test.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.test.entity.User;

public class UserDaoImpl {
	private SqlSession sql;
	
	private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);
	
	@Before
	public void init() throws IOException{
		SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder();
		
		InputStream  input = Resources.getResourceAsStream("mybatis.xml");
		
		SqlSessionFactory se= sfb.build(input);
		
		 sql = 	se.openSession();
	}
	@Test
	public void selectUserOfOrder(){
		
	List<User> orders = 	sql.selectList("cn.test.dao.UserDaoImpl.selectUserOfOrder");
	
	for(User u:  orders){
		
		System.out.println(u);
		
	}
		
	}
	@Test
	public void addUser(){//hahahaha
		
		User user = new User();
		
		user.setName("6.1了呀");
		
		
		@SuppressWarnings("unused")
		int orders = 	sql.insert("cn.test.dao.UserDaoImpl.addUser",user);
		sql.commit();
		
		System.out.println(user.getId());
		
		logger.info("..............");
		
		
	}

}
