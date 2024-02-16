package com.example.spring.Wiring;

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
    	Employee emp= (Employee)(ctx.getBean("ep1"));
        System.out.println(emp);
        Employee emp1= (Employee)(ctx.getBean("ep2"));
        System.out.println(emp1);
        
        CompanyXYZ com=(CompanyXYZ)ctx.getBean("cmp");
        System.out.println(com);
    }
}
