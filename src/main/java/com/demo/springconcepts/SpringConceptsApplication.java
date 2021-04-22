package com.demo.springconcepts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.demo.springconcepts.components.DemoBean;
import com.demo.springconcepts.components.EmployeeBean;



@SpringBootApplication
public class SpringConceptsApplication {

	public static final Logger logger = LoggerFactory.getLogger(SpringConceptsApplication.class);
	public static void main(String[] args) {
		logger.debug("Welcome to spring concept demo");
		ConfigurableApplicationContext context = SpringApplication.run(SpringConceptsApplication.class, args);
		logger.debug(context.getBean(DemoBean.class).toString()); 
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		employeeBean.setEid(105);
		employeeBean.setEname("Spring Framework Guru");
		employeeBean.showEmployeeDetails();
	}
}
