package com.example.spring.SpringProject2Laptop;

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
    	Laptop lp1Obj=(Laptop)ctx.getBean("lt1");
        System.out.println( lp1Obj);
        Laptop lp2Obj=(Laptop)ctx.getBean("lt2");
        System.out.println( lp2Obj);
    }
}
