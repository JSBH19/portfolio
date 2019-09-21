package com.jsbh.portfolio;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private DataSource ds;

	@Test
	public void contextLoads() {
	}

	@Test
	public void connectionTest() throws SQLException {

		System.out.println(" >_ < ");
		System.out.println(ds);
		Connection con = ds.getConnection();
		System.out.println(con);
	}
}
