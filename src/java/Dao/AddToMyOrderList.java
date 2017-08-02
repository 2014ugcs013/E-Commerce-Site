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
public class AddToMyOrderList {

    public AddToMyOrderList() {
    }
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

    public AddToMyOrderList(int item_id,String user) {
           this.item_id = item_id;
           this.user = user;
    }

    
    public int id,item_id;
    String user;
    
    public void addingToMyOrderedList(int id,String name)
    {
        System.out.println("updating things");
        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.configure();
        
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        
        String hql = "update MyCart set ordered = 1 where item_id = :id";
        Query query = s.createQuery(hql);
        query.setParameter("id", id);
        int row = query.executeUpdate();
        
        t.commit();
        System.out.println("**********ordered item with item_id*********"+id+"........and.......row updated ......"+row);
        s.close();
    }
}
