package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Employee;

public class TestApp {

	public static void main(String[] args) {
		//read and print the employee i.e parent object
				ApplicationContext ctx=new ClassPathXmlApplicationContext("com/app/beans/Springconfig.xml");
				Employee e=(Employee)ctx.getBean("empObj");
					System.out.println(e);

	}

}
