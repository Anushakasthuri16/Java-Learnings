package com.example.spring.SpringProject1;

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
    	Student stObj=(Student)ctx.getBean("st");
        System.out.println( stObj );
        JavaTeacher jvObj=(JavaTeacher)ctx.getBean("jvt");
        System.out.println( jvObj);
    	SqlTeacher sqObj=(SqlTeacher)ctx.getBean("sqt");
        System.out.println( sqObj);
    	PythonTeacher pyObj=(PythonTeacher)ctx.getBean("pyt");
        System.out.println( pyObj);
    }
}
