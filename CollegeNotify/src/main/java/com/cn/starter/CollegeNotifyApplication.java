package com.cn.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@ComponentScan("com.cn")
@EnableJpaRepositories("com.cn.repository")
@EntityScan("com.cn.model")

@SpringBootApplication
public class CollegeNotifyApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollegeNotifyApplication.class, args);
	}

}
