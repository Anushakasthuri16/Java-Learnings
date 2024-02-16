package com.example.Bi.OneToMany;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App 
{
    public static void main( String[] args )
    {
        Technology t1=new Technology(123,"Java");
        Technology t2=new Technology(234,"Html");
        Technology t3=new Technology(345,"Css");
        Technology t4=new Technology(346,"Sql");
        
        List<Technology> l1=new ArrayList<Technology>();
        List<Technology> l2=new ArrayList<Technology>();
        List<Technology> l3=new ArrayList<Technology>();
        
        l1.add(t1);
        l1.add(t2);
        
        l2.add(t1);
        l2.add(t2);
        l2.add(t3);
        l2.add(t4);
        
        l3.add(t1);
        l3.add(t4);
        
                
        softwareEng se1=new softwareEng(23,"Anu",22,l1);
        softwareEng se2=new softwareEng(24,"Vignya",13,l2);
        softwareEng se3=new softwareEng(25,"Manoj",20,l3);
        Configuration cfg=new Configuration().configure();
        SessionFactory sf=cfg.buildSessionFactory();
        Session ses=sf.openSession();
        Transaction tr=ses.beginTransaction();
        
        ses.save(se1);
        ses.save(se2);
        ses.save(se3);
        
        ses.save(t1);
        ses.save(t2);
        ses.save(t3);
        ses.save(t4);
        tr.commit();
        System.out.println("Session Saved");
    }
}
