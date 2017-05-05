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
        
        // Gange med en factor jo større carporten er
        // Giv detail på 3*3*3 en fast produkt liste, men hvis målene stiger skal der ganges (ikke brug plus)    
        Orderline ol = new Orderline((width*heigth+length+40), (width*heigth+length+20)*10+167, roof, (width*heigth+length+20)*10+99, detail);
        return ol;
    }
    
    public static void main(String[] args) {
        OrderlineCalculator oc = new OrderlineCalculator();
        Orderline o = oc.calcParts(6, 4, 7, "test");
        System.out.println(o.getWood_qty());
        System.out.println(o.getScrew_qty());
        System.out.println(o.getBracket());
    }
    
}
