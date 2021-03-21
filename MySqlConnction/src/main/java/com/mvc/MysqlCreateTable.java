package com.mvc;

import org.springframework.jdbc.core.JdbcTemplate;

public class MysqlCreateTable {
private	JdbcTemplate jdbcTemplate;
public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate=jdbcTemplate;
}
	public void createTable() {
		jdbcTemplate.execute("create table emplyee(employee_id int(3), Employee_name varchar(10))");
		System.out.println("table created");

	}

}
