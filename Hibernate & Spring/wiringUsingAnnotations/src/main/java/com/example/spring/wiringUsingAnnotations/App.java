package com.example.spring.wiringUsingAnnotations;

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
    	Professor prf1= (Professor)(ctx.getBean("pr"));
        System.out.println(prf1);
        Professor prf2= (Professor)(ctx.getBean("pr2"));
        System.out.println(prf2);
       /* Professor prf3= (Professor)(ctx.getBean("pr3"));
        System.out.println(prf3);
        */
        University unv= (University)(ctx.getBean("unv"));
        System.out.println(unv);
    }
}
