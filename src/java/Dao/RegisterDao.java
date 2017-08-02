/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import bean.User;
import hp.Register;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author AlokKumar
 */
public class RegisterDao {

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    
    
    public String name,email,password,address,username;
    
    public boolean check(Register ral)
    {
        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.configure();
        
        SessionFactory sf = cfg.buildSessionFactory();
        
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        
        System.out.println(" name : "+ral.getName());
        User us = new User();
        us.setName(ral.getName());
        us.setUsername(ral.getUsername());
        us.setAddress(ral.getAddress());
        us.setEmail(ral.getEmail());
        us.setPassword(ral.getPassword());
        String id = (String)s.save(us);
        t.commit();
        System.out.println("********************printing username : "+id);
        
        return true;
    }
}
