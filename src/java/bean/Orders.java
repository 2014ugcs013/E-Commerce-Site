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
public class Orders {
    
    public int o_id,cart_id;

    /**
     * @return the o_id
     */
    public int getO_id() {
        return o_id;
    }

    /**
     * @param o_id the o_id to set
     */
    public void setO_id(int o_id) {
        this.o_id = o_id;
    }

    /**
     * @return the cart_id
     */
    public int getCart_id() {
        return cart_id;
    }

    /**
     * @param cart_id the cart_id to set
     */
    public void setCart_id(int cart_id) {
        this.cart_id = cart_id;
    }
}
