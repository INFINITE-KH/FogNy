/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Service;

import com.Entity.Detail;
import com.Entity.Orderline;

public class OrderlineCalculator {
    
    public Orderline calcParts(int length, int heigth, int width, String roof){
        Detail detail = new Detail(length, heigth, width, roof);
        
        //For every meter, 10 pieces of wood is needed. 
        //In totalWood amount of wood for length is doubled, as there are 2 sides.
        int lengthWood = length*10;
        int widthWood = width*10;
        
        //The heigth is just 4 supporting poles.
        int heigthWood = 4;
        int totalWood = (lengthWood*2)+widthWood+heigthWood;
        
        Orderline ol = new Orderline(totalWood, totalWood*4, roof, totalWood*3, detail);
        return ol;
    }
    
    public static void main(String[] args) {
        OrderlineCalculator oc = new OrderlineCalculator();
        Orderline o = oc.calcParts(3, 2, 2, "test");
        System.out.println("Antal træ: " + o.getWood_qty());
        System.out.println("Antal skruer: " + o.getScrew_qty());
        System.out.println("Antal brackets: " + o.getBracket());
    }
    
}
