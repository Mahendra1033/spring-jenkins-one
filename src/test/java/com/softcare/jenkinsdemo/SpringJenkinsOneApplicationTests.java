package com.softcare.jenkinsdemo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringJenkinsOneApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsOneApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Example For Pipeline Testing !!!");
		assertEquals(true,true);
	}

}
