package com.Entity;

import java.sql.Date;

public class Orders {
   
    private int ono;
    private Date checkout;
    private Date deliviry;
    private double shipping;
    private int orderline_id;

    public Orders(int ono, Date checkout, Date deliviry, double shipping, int orderline_id) {
        this.ono = ono;
        this.checkout = checkout;
        this.deliviry = deliviry;
        this.shipping = shipping;
        this.orderline_id = orderline_id;
    }

    public int getOno() {
        return ono;
    }

    public void setOno(int ono) {
        this.ono = ono;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    public Date getDeliviry() {
        return deliviry;
    }

    public void setDeliviry(Date deliviry) {
        this.deliviry = deliviry;
    }

    public double getShipping() {
        return shipping;
    }

    public void setShipping(double shipping) {
        this.shipping = shipping;
    }

    public int getOrderline_id() {
        return orderline_id;
    }

    public void setOrderline_id(int orderline_id) {
        this.orderline_id = orderline_id;
    }

    @Override
    public String toString() {
        return "Orders{" + "ono=" + ono + ", checkout=" + checkout + ", deliviry=" + deliviry + ", shipping=" + shipping + ", orderline_id=" + orderline_id + '}';
    }

 
    
}
