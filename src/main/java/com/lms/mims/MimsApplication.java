package com.lms.mims;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lms.mims.mapper")
public class MimsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MimsApplication.class, args);
	}
}
