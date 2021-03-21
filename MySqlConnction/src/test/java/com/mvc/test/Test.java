package com.mvc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mvc.MysqlCreateTable;

public class Test {

	public static void main(String[] args) {
	ApplicationContext applicationContext=new  ClassPathXmlApplicationContext("conn.xml"); 
	MysqlCreateTable mysqlCreateTable=(MysqlCreateTable) applicationContext.getBean("mysqlCreateTable");
	mysqlCreateTable.createTable();
	

	}

}
