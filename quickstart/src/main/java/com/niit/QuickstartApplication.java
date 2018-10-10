package com.niit;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class QuickstartApplication {

	public static void main(String[] args) {
		//启动boot，获取上下文
//		ApplicationContext ac = SpringApplication.run(QuickstartApplication.class,args);
//		System.out.println("使用 Spring Boot ,由Teacher和Student装配成Course");
//		//获取hello
//		Course course = (Course) ac.getBean("course");
//		System.out.println(course);
		SpringApplication.run(QuickstartApplication.class,args);
	}
}
