package com.softcare.jenkinsdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinsOneApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsOneApplication.class);

	@PostConstruct
	public void init(){
		logger.info("Example For Pipeline");
	}
	public static void main(String[] args) {
		logger.info("This is Main method inside the main class");
		SpringApplication.run(SpringJenkinsOneApplication.class, args);
	}

}
