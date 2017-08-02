/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import hp.Login;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import bean.User;
import com.mysql.jdbc.Connection;
import javax.servlet.http.HttpSession;
/**
 *
 * @author AlokKumar
 */
public class LoginDao {

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
    public String username;
    public String password;
    
    public boolean check(Login rag)
    {
        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.configure();
        
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        User u = (User)s.get(User.class,rag.getUsername());
        System.out.println("name : "+u.getName());
        System.out.println("email : "+u.getEmail());
        if(u != null)
        {
            
            return true;
        }
        return false;
    }
}
