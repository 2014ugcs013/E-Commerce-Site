/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author AlokKumar
 */
public class MyCart {

    /**
     * @return the ordered
     */
    public int getOrdered() {
        return ordered;
    }

    /**
     * @param ordered the ordered to set
     */
    public void setOrdered(int ordered) {
        this.ordered = ordered;
    }

    /**
     * @return the dispatch
     */
    public int getDispatch() {
        return dispatch;
    }

    /**
     * @param dispatch the dispatch to set
     */
    public void setDispatch(int dispatch) {
        this.dispatch = dispatch;
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
     * @return the count
     */
    public int getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(int count) {
        this.count = count;
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

   
    public int id,item_id,count,ordered,dispatch;
    public String user;
}
