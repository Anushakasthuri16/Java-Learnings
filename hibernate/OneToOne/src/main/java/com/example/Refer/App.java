package com.example.Refer;

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
        Bikee b1=new Bikee(321,"Honda",700000);
        
        Bikee b2=new Bikee(7654,"Ktm",150000);
       
        Bikee b3=new Bikee(9876,"RoyalEnfield",120000);
        Personn p1=new Personn(12,"Anu",75,b1);
        
        Personn p2=new Personn(96,"Bindhu",73,b2);
        
        Personn p3=new Personn(03,"Pooji",83,b3);
    
       
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
