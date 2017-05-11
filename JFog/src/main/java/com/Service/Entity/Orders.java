package com.Service.Entity;

import java.sql.Date;

public class Orders {
   
    private int ono;
    private Date checkout;
    private Date deliviry;
    private double shipping;
    private int carportmaterial_id;

    public Orders(int ono, Date checkout, Date deliviry, double shipping, int carportmaterial_id) {
        this.ono = ono;
        this.checkout = checkout;
        this.deliviry = deliviry;
        this.shipping = shipping;
        this.carportmaterial_id = carportmaterial_id;
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

    public int getcarportmaterial_id() {
        return carportmaterial_id;
    }

    public void setcarportmaterial_id(int carportmaterial_id) {
        this.carportmaterial_id = carportmaterial_id;
    }

    @Override
    public String toString() {
        return "Orders{" + "ono=" + ono + ", checkout=" + checkout + ", deliviry=" + deliviry + ", shipping=" + shipping + ", orderline_id=" + carportmaterial_id + '}';
    }

 
    
}
