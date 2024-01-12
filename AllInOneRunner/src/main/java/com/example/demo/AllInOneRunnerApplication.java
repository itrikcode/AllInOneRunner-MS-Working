package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AllInOneRunnerApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context =	SpringApplication.run(AllInOneRunnerApplication.class, args);
	startEntityManager(context);
	System.out.println("AllInOneRunnerApplication.main()");
	startQueryManager(context);
	System.out.println("AllInOneRunnerApplication.main()");
	startCommon(context);

	}
	
	private static void startEntityManager(ConfigurableApplicationContext context) {
	context.getBean(EntityManagerApplication.class);
	
	}
	
	private static void startQueryManager(ConfigurableApplicationContext context) {
		context.getBean(QueryManagerApplication.class);
		
		}
	
	private static void startCommon(ConfigurableApplicationContext context) {
		context.getBean(CommonApplication.class);
		
		}

}
