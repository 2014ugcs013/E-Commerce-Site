/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hp;

import bean.Item;
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
public class InsertItemsInCash_items {

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
     * @return the imgUrl
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * @param imgUrl the imgUrl to set
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
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
    
    public String name,imgUrl,about,seller;
    public int price;
    
//    public Item(String imgUrl, String name, String seller, float price, String about) {
    public static void main(String[] args) {
        
        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.configure();
        
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        Item it1 = new Item(1,"res\\ac_2007.jpg","Assassin's Creed (2007)","unisoft",5000,"Assassin's Creed (2007)","game");
        Item it2 = new Item(2,"res\\ac_20014.jpg","Assassin's Creed Unity (2014)","unisoft",5500,"Assassin's Creed Unity (2014)","game");
        Item it3 = new Item(3,"res\\ac_20011.jpg","Assassin's Creed: Revelations (2011)","unisoft",5000,"Assassin's Creed: Revelations (2011)","game");
        s.save(it1);
        s.save(it2);
        s.save(it3);
        t.commit();
        System.out.println("insertion successfull");
    }
}
