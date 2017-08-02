/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import bean.Item;
import bean.User;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author AlokKumar
 */
public class GetItems {

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
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
     * @return the about
     */
    public String getAbout() {
        return about;
    }

    /**
     * @param about the about to set
     */
    public void setAbout(String about) {
        this.about = about;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the seller
     */
    public String getSeller() {
        return seller;
    }

    /**
     * @param seller the seller to set
     */
    public void setSeller(String seller) {
        this.seller = seller;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }
    public String name,url,seller,about,category;
    public int price,id;
    
    
    public List<Item> getItems()
    {
        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.configure();
        
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        Query q = s.createQuery("from Item");
        List<Item> list = q.list();
        return list;
    }
    public List<Item> getItemsByName()
    {
        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.configure();
        
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        Criteria c = s.createCriteria(Item.class);
        c.addOrder(Order.asc("name"));
        List<Item> list = c.list();
        return list;
    }
    public List<Item> getItemsByPrice()
    {
        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.configure();
        
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        Criteria c = s.createCriteria(Item.class);
        c.addOrder(Order.asc("price"));
        List<Item> list = c.list();
        return list;
    }
}
