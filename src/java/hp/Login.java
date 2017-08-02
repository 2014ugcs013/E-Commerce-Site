/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hp;

import Dao.LoginDao;
import Dao.RegisterDao;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author AlokKumar
 */
public class Login extends ActionSupport implements SessionAware{

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

    
    public Login() {
    }
    
    public String username,name,password;
    public Map<String,Object> sessionMap;
    
    
//     public String register() throws Exception{
//        RegisterDao rd = new RegisterDao();
//        System.out.println(" gonna print name : "+name);
//        if(rd.check(this))
//             return "success";
//        return "fail";
//    }
    public String login() throws Exception{
        System.out.println("................in login..........");
        LoginDao ld = new LoginDao();
        //check if user is already logined
        String loggedUser = null;
        if(sessionMap.containsKey("username"))
        {
            loggedUser = (String)sessionMap.get("username");
        }
        if(loggedUser != null && ld.check(this))
        {
            return "success";
        }
        if(loggedUser == null && ld.check(this))
        {
            sessionMap.put("username", getUsername());
            return "success";
        }
        return "fail";
    }

    public String logout()throws Exception
    {
        if (sessionMap.containsKey("username")) {
            sessionMap.remove("username");
        }
        return "success";
        
    }
    @Override
    public void setSession(Map<String, Object> map) {
        this.sessionMap = map;
    }
    
}
