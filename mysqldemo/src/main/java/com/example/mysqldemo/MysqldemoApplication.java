package com.example.mysqldemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class MysqldemoApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbctemplate;

	public static void main(String[] args) {
		SpringApplication.run(MysqldemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String sql=" INSERT INTO login(id,email,password,type) VALUES (?,?,?,?)";
		int result = jdbctemplate.update(sql,"13","Reyna", "1234","Cashier");

		if(result>0){
			System.out.println("A New user has been registered.");
		}

	}
}
