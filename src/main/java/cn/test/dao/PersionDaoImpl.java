package cn.test.dao;



import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import cn.test.entity.Persion;


public class PersionDaoImpl {
	
	private SqlSession sql;
	
	/*@Test
	public void selectPersion() throws IOException{
		SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder();
		
		InputStream  input = Resources.getResourceAsStream("mybatis.xml");
		
		SqlSessionFactory se= sfb.build(input);
		
		SqlSession sql = 	se.openSession();
	
		List<Persion> a = sql.selectList("cn.test.dao.PersionDaoImpl.selectPersion");
		
		for(Persion v: a){
			
			System.out.println(v);
			
		}
		
	}*/
	@Before
	public void init() throws IOException{
		SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder();
		
		InputStream  input = Resources.getResourceAsStream("mybatis.xml");
		
		SqlSessionFactory se= sfb.build(input);
		
		 sql = 	se.openSession();
	}
	
	@Test
	public void selectPersion1() throws IOException{
		
		
	
		List<Map<String,Object>> a = sql.selectList("cn.test.dao.PersionDaoImpl.selectPersion1");
		
		for(Map<String,Object> v: a){
								
			System.out.println(v);
			
		}
		
	}
	@Test
	public void selectPersion2() throws IOException{
		
		Map<String,Object> map = new HashMap<String, Object>();
		
		
		map.put("name", "胡超");
		//map.put("age", 27);
	
		List<Map<String,Object>> a = sql.selectList("cn.test.dao.PersionDaoImpl.selectPersion2",map);
		
		System.out.println(a);
			
		
		
	}
	
	@Test
	public void updatePersion(){
		Map<String,Object> map = new HashMap<String, Object>();
		
		
	/*	map.put("name", "鑫鑫");
		map.put("id", 1);*/
	
		int a = sql.update("cn.test.dao.PersionDaoImpl.updatePersion",map);
		
		sql.commit();
		
		System.out.println(a);
		
	}

}
