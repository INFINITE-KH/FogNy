/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.calculator;

import Service.Entity.Detail;
import Service.Entity.CarportMaterial;

public class MaterialCalculator {
    
    /**
     * Calcculate parts needed for a carport with the dimensions given in the parameters
     * @param length
     * @param heigth
     * @param width
     * @param roof
     * @return 
     */
    public CarportMaterial calcParts(int length, int heigth, int width, String roof){
        Detail detail = new Detail(length, heigth, width, roof);
        
        //For every meter, 10 pieces of wood is needed. 
        //In totalWood amount of wood for length is doubled, as there are 2 sides.
        int lengthWood = length*10;
        int widthWood = width*10;
        
        //The heigth is just 4 supporting poles.
        int heigthWood = 4;
        int totalWood = (lengthWood*2)+widthWood+heigthWood;
        
        //For each wood there is used 4 screws, and a total amount of 75% brackets for the entire carport.
        //The first parameter is the total amount of wood, the second is the amount of screws, the fourth is amount of brackets.
        CarportMaterial ol = new CarportMaterial(totalWood, totalWood*4, roof, totalWood*3, detail);
        return ol;
    }
    
    public static void main(String[] args) {
        MaterialCalculator oc = new MaterialCalculator();
        CarportMaterial o = oc.calcParts(3, 2, 2, "test");
        System.out.println("Antal træ: " + o.getWood_qty());
        System.out.println("Antal skruer: " + o.getScrew_qty());
        System.out.println("Antal brackets: " + o.getBracket());
    }
    
}
