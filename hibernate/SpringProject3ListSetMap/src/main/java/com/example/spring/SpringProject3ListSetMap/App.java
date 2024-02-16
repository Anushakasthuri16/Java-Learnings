package com.example.spring.SpringProject3ListSetMap;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
    	Employee empObj=(Employee)ctx.getBean("emp");
        System.out.println(empObj);
    }
}
