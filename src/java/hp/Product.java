/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hp;

import Dao.AddToMyCart;
import Dao.AddToMyOrderList;
import Dao.GetCartItems;
import Dao.GetDescription;
import Dao.RemoveFromMyCart;
import bean.Item;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author AlokKumar
 */
public class Product {

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

   public int id;
   
    public String about()
    {
        System.out.println("getting called about: Product.java with id : "+id);
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("id", id);
        return "success";
    }
    public String addToCart()
    {
        System.out.println("getting called addToCat: Product.java with id : "+id);
        //adding to mycart 
        HttpSession s = ServletActionContext.getRequest().getSession();
        String name = (String)s.getAttribute("username");
        AddToMyCart atmc = new AddToMyCart(id,name);
        System.out.println("name : "+name);
        System.out.println("item_id   : "+id);
        atmc.addingToCart();
        return "success";
    }
    public String remove()
    {
        System.out.println("removing cart item with id : "+id);
        HttpSession s = ServletActionContext.getRequest().getSession();
        String name = (String)s.getAttribute("username");
        RemoveFromMyCart rfmc = new RemoveFromMyCart();
        rfmc.remove(id,name);
        return "success";
    }
    public String addInOrder()
    {
        System.out.println("ordering item with id : "+id);
        HttpSession s = ServletActionContext.getRequest().getSession();
        String name = (String)s.getAttribute("username");
        AddToMyOrderList rfmc = new AddToMyOrderList();
        rfmc.addingToMyOrderedList(id,name);
        return "success";
    }
}
