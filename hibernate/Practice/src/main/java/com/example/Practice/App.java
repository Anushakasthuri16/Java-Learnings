package com.example.Practice;

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
    	SessionFactory sf=new SessionFactory();
    
        System.out.println( "Executed" );
        System.out.println(sf);
    }
}
