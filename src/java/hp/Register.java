/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hp;

import Dao.RegisterDao;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author AlokKumar
 */
public class Register extends ActionSupport {

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
    
    public Register() {
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
        System.out.println("********************* Setting name ******************"+name);
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
        System.out.println("********************* Setting email ******************"+email);
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
        System.out.println("********************* Setting password ******************"+password);
        this.password = password;
    }

  
    
   
    public String name,email,password,address,username;
    
    
    @Override
    public String execute() throws Exception {
        Dao.RegisterDao rd = new Dao.RegisterDao();
        System.out.println("**************address*********"+address);
        System.out.println(" gonna print name : "+name);
        if(rd.check(this))
             return "success";
        return "fail";
    }
    
}
