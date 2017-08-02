/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author AlokKumar
 */
public class RemoveFromMyCart {
    
    public void remove(int id,String name)
    {
        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.configure();
        
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        
        Transaction t = s.beginTransaction();
        String hql = "delete MyCart where item_id = "+id;
        Query q = s.createQuery(hql);
        int row = q.executeUpdate();
        t.commit();
        s.close();
        sf.close();
        System.out.println("row deleted : "+row);
    }
}
