package com.example.Example2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       
        Configuration cfg=new Configuration();
        System.out.println("Configuartion Created");
        cfg.configure();
        System.out.println("Method configure is Imported");
        SessionFactory sf=cfg.buildSessionFactory();
        System.out.println("Session Bulided "+sf);
        Session session=sf.openSession();
        System.out.println("Session is opened "+session);
        Transaction tr=session.beginTransaction();
        System.out.println("Transaction begins "+tr);
        Person p1=new Person(12,"Anu",75);
        
        Person p2=new Person(96,"Bindhu",73);
        
        Person p3=new Person(03,"Pooji",83);
    
        Bike b1=new Bike(321,"Honda",700000);
     
        Bike b2=new Bike(7654,"Ktm",150000);
       
        Bike b3=new Bike(9876,"RoyalEnfield",120000);
        System.out.println("Object created and Table values are Inserted");
        
        session.save(p1);
        session.save(p2);
        session.save(p3);
        session.save(b1);
        session.save(b2);
        session.save(b3);
        
        System.out.println("Session saved ");
        tr.commit();
        System.out.println("Changes are Commited");
        System.out.println(sf);
        System.out.println("Succesfully Completed");
    }
}
