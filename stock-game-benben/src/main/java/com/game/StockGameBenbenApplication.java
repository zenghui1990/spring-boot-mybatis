package com.game;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.game.dao")
public class StockGameBenbenApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockGameBenbenApplication.class, args);
	}
}
