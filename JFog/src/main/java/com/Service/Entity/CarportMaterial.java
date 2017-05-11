package com.Service.Entity;

public class CarportMaterial {
    private int wood_qty;
    private int screw_qty;
    private String roof;
    private int bracket;
    private Detail detail;

    public CarportMaterial(int wood_qty, int screw_qty, String roof, int bracket, Detail detail) {
        this.wood_qty = wood_qty;
        this.screw_qty = screw_qty;
        this.bracket = bracket;
        this.roof = roof;
        this.detail = detail;
    }

    public int getWood_qty() {
        return wood_qty;
    }

    public void setWood_qty(int wood_qty) {
        this.wood_qty = wood_qty;
    }

    public int getScrew_qty() {
        return screw_qty;
    }

    public void setScrew_qty(int screw_qty) {
        this.screw_qty = screw_qty;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public int getBracket() {
        return bracket;
    }

    public void setBracket(int bracket) {
        this.bracket = bracket;
    }
    
    public Detail getDetail(){
        return detail;
    }
    
    public void setDetail(Detail detail){
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Orderline{" + ", wood_qty=" + wood_qty + ", screw_qty=" + screw_qty + ", roof=" + roof + ", bracket=" + bracket + '}';
    }
    
}
