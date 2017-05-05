package com.Entity;

import java.util.ArrayList;
import java.util.List;

public class Carport {
    
    private int id;
    private String carname;
    private String measure;
    private double price;
    private List<CarportPart> partList = new ArrayList<CarportPart>();

    public Carport(int id, String carname, String measure, double price) {
        this.id = id;
        this.carname = carname;
        this.measure = measure;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public List<CarportPart> getParts(){
        return partList;
    }
    
    public void setPartsList(List<CarportPart> cpList){
        this.partList = cpList;
    }
    
}
