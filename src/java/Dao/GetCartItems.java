/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import bean.Item;
import bean.ItemAndCount;
import bean.MyCart;
import java.util.ArrayList;
import java.util.List;
import org.apache.struts2.ServletActionContext;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author AlokKumar
 */
public class GetCartItems {

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
    public int getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(int user) {
        this.user = user;
    }


    public int id,item_id,user;
    
    public List<ItemAndCount> getCartItems(String users)
    {
        System.out.println("user ............"+users);
        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.configure();
        
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        //Query q = s.createQuery("from Item");
        //select * from mycart where user = users;
        Criteria c = s.createCriteria(MyCart.class);//select * from mycart;
        users = users.trim();
        System.out.println("user.........."+users);
        Criterion cr = Restrictions.eq("user", users);
        Criterion cr1 = Restrictions.ne("ordered", 1);
        c.add(cr);
        c.add(cr1);
        List<MyCart> li = c.list();
        System.out.println("************MyCartContent***********");
        List<ItemAndCount> list = new ArrayList<ItemAndCount>();;
        for(MyCart myc : li)
        {
            System.out.println("id : "+myc.getId()+"   user : "+myc.getUser()+"   item_id :  "+myc.getItem_id()+"   item_count "+myc.getCount());
            Item it = (Item)s.load(Item.class, myc.getItem_id());
            ItemAndCount iac = new ItemAndCount(it.getId(),it.getImgUrl(), it.getName(), it.getSeller(), it.getPrice(), it.getAbout(), myc.getCount());
            
            System.out.println("item_id : "+iac.id+"   user : "+iac.name+"   item_price :  "+iac.price+"   item_count "+iac.getCount());
            list.add(iac);
        }
        return list;
    }
    public List<ItemAndCount> getOrderdItems(String users)
    {
        System.out.println("user ............"+users);
        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.configure();
        
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        //Query q = s.createQuery("from Item");
        //select * from mycart where user = users;
        Criteria c = s.createCriteria(MyCart.class);//select * from mycart;
        users = users.trim();
        System.out.println("user.........."+users);
        Criterion cr = Restrictions.eq("user", users);
        Criterion cr1 = Restrictions.eq("ordered", 1);
        Criterion cr2 = Restrictions.ne("dispatch",1);
        c.add(cr);
        c.add(cr1);
        c.add(cr2);
        List<MyCart> li = c.list();
        System.out.println("************MyCartContent***********");
        List<ItemAndCount> list = new ArrayList<ItemAndCount>();;
        for(MyCart myc : li)
        {
            System.out.println("id : "+myc.getId()+"   user : "+myc.getUser()+"   item_id :  "+myc.getItem_id()+"   item_count "+myc.getCount());
            Item it = (Item)s.load(Item.class, myc.getItem_id());
            ItemAndCount iac = new ItemAndCount(it.getId(),it.getImgUrl(), it.getName(), it.getSeller(), it.getPrice(), it.getAbout(), myc.getCount());
            
            System.out.println("item_id : "+iac.id+"   user : "+iac.name+"   item_price :  "+iac.price+"   item_count "+iac.getCount());
            list.add(iac);
        }
        return list;
    }
    public List<ItemAndCount> getAllordered(String users)
    {
        System.out.println("user ............"+users);
        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.configure();
        
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        //Query q = s.createQuery("from Item");
        //select * from mycart where user = users;
        Criteria c = s.createCriteria(MyCart.class);//select * from mycart;
        users = users.trim();
        System.out.println("user.........."+users);
        Criterion cr1 = Restrictions.eq("ordered", 1);
        c.add(cr1);
        List<MyCart> li = c.list();
        System.out.println("************MyCartContent***********");
        List<ItemAndCount> list = new ArrayList<ItemAndCount>();;
        for(MyCart myc : li)
        {
            System.out.println("id : "+myc.getId()+"   user : "+myc.getUser()+"   item_id :  "+myc.getItem_id()+"   item_count "+myc.getCount());
            Item it = (Item)s.load(Item.class, myc.getItem_id());
            ItemAndCount iac = new ItemAndCount(it.getId(),it.getImgUrl(), it.getName(), it.getSeller(), it.getPrice(), it.getAbout(), myc.getCount());
            
            System.out.println("item_id : "+iac.id+"   user : "+iac.name+"   item_price :  "+iac.price+"   item_count "+iac.getCount());
            list.add(iac);
        }
        return list;
    }
}
