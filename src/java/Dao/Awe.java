/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import bean.MyCart;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author AlokKumar
 */
public class Awe {
    
    public static void main(String[] args) {
        
            AnnotationConfiguration cfg = new AnnotationConfiguration();
            cfg.configure();

            SessionFactory sf = cfg.buildSessionFactory();
            Session s = sf.openSession();
            Transaction t = s.beginTransaction();
            System.out.println("...........before");
            Query q=s.createQuery("update MyCart as mc set mc.count=:n where mc.id=:i");  
            q.setParameter("n",2);  
            q.setParameter("i",1);  

            int status=q.executeUpdate(); 
            
            System.out.println("...........successfully inserted..........in row........"+status);
//            MyCart mc = new MyCart();
//            mc.setCount(0);
//            mc.setItem_id(2);
//            mc.setUser("alok");
//            int tr = (int) s.save(mc);
//            System.out.println("save successfullly : "+tr);
            t.commit();
            s.close();
    }
}
