package com.lms.mims;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.lms.mims.mapper")
public class MimsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MimsApplication.class, args);
	}
}
