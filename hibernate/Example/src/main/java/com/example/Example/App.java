package com.example.Example;




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
        Student st=new Student(12,"Anu",75);
        System.out.println("Object craeted and Table values are Inserted "+st);
        session.save(st);
        System.out.println("Session saved ");
        tr.commit();
        System.out.println("Changes are Commited");
        System.out.println(sf);
        System.out.println("Succesfully Completed");
    }
}
