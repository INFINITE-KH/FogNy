package com.Service.Entity;

public class Detail {
    
    private int length;
    private int heigth;
    private int width;
    private String roof;

    public Detail(int length, int heigth, int width, String roof) {
        this.length = length;
        this.heigth = heigth;
        this.width = width;
        this.roof = roof;
    }
    
   public Detail(int length, int width, String roof) {       
        this.length = length;
        this.width = width;
        this.roof = roof;
    }

    public int getLength() {
        return length;
    }

    public void setLendth(int length) {
        this.length = length;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }
    
}
