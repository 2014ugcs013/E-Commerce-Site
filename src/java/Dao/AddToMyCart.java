/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import bean.MyCart;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author AlokKumar
 */
public class AddToMyCart {
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the item_id
     */
    public int getItem_id() {
        return item_id;
    }

    /**
     * @param item_id the item_id to set
     */
    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    public AddToMyCart(int item_id,String user) {
           this.item_id = item_id;
           this.user = user;
    }

    
    public int id,item_id;
    String user;
    
    public void addingToCart()
    {
        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.configure();
        
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        
        String hql = "from MyCart where item_id = :id and user = :user";
        Query query = s.createQuery(hql);
        query.setParameter("id", item_id);
        query.setParameter("user", user);
        MyCart mct = (MyCart)query.uniqueResult();
        if(mct == null)
        {
            MyCart mc = new MyCart();
            mc.setItem_id(item_id);
            mc.setUser(user);
            mc.setCount(1);
            int pk = (Integer)s.save(mc);
            System.out.println("successfully saved with id : "+pk);
        }
        else
        {
            System.out.println("Not inserting anything : "+mct.getId());
            hql = "update MyCart as mc set mc.count = :count "
                   + "where mc.id = :id";
            Query query1 = s.createQuery(hql);
            int count = mct.getCount()+1;
            query1.setParameter("count", count);
            query1.setParameter("id", mct.getId());
            int result = query1.executeUpdate();
            
            System.out.println("...........successfully inserted..........in row........"+result);
        }
        t.commit();
        System.out.println("**********way to insert*********");
        s.close();
    }
}
