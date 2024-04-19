package com.example.demo13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

@SpringBootApplication
public class Demo13Application {

	public static void main(String[] args) {

		SpringApplication.run(Demo13Application.class, args);

		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Test t1=context.getBean("test",Test.class);
		System.out.println(t1);

		SpelExpressionParser temp=new SpelExpressionParser();
		Expression expression= temp.parseExpression("22+44");
		System.out.println(expression.getValue());
	}

}