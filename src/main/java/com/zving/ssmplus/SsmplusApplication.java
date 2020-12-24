package com.zving.ssmplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zving.ssmplus.dao")
public class SsmplusApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsmplusApplication.class, args);
	}

}
