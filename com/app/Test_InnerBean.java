package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.entity.Employee;


public class Test_InnerBean {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/app/cfgs/config.xml");
			Object ob=ctx.getBean("emp");
				Employee e=(Employee)ob;
				
					System.out.println("\t\t"+e);
					

	}

}
