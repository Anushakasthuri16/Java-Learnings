package com.example.Bi.BiDirectional;

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
        Persons p1=new Persons();
        Persons p2=new Persons();
        Persons p3=new Persons();
        Bikes b1=new Bikes(321,"Honda",700000,p1);
        
        Bikes b2=new Bikes(7654,"Ktm",150000,p2);
       
        Bikes b3=new Bikes(9876,"RoyalEnfield",120000,p3);
        p1.setId(1232);
        p1.setName("Amit");
        p1.setAge(25);
        p1.setB(b1);
        
        p2.setId(1312);
        p2.setName("Anuj");
        p2.setAge(27);
        p2.setB(b2);
        
        p3.setId(1465);
        p3.setName("Akash");
        p3.setAge(29);
        p3.setB(b3);


    
       
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
