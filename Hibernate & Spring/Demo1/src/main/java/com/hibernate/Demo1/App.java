package com.hibernate.Demo1;

import org.hibernate.cfg.Configuration;

import com.mysql.cj.xdevapi.SessionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 Configuration cfg=new Configuration();
    	 cfg.configure();
    	 SessionFactory factory =new SessionFactory();
    	
    	 
        System.out.println( "Hello World!" );
    }
}
