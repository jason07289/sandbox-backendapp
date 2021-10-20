package com.example.demo.test;

import static org.junit.jupiter.api.Assertions.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JdbcConnectionTest {
	
	/*
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/sandbox?characterEncoding=UTF-8&serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PW = "root";

	@Test
	public void testConnectcion() throws Exception {
		Class.forName(DRIVER);

		try (Connection con = DriverManager.getConnection(URL, USER, PW)) {
			System.out.println(con);

		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	*/
	
}
