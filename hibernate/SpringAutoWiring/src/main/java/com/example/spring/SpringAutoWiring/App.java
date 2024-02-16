package com.example.spring.SpringAutoWiring;

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
    	Engine eg1=(Engine)ctx.getBean("eng");
        System.out.println(eg1);
        //Engine eg2=(Engine)ctx.getBean("eng2");
        //System.out.println(eg2);
        
        car c1=(car)ctx.getBean("car1");
        System.out.println(c1);
        
    }
}
