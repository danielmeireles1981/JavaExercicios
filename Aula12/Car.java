/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage;

/**
 *
 * @author kees
 */
public class Car {
    
    private int speed;
    
    private double regularPrice;
    
    private String color;
    
    public double getSalePrice(){
        return regularPrice;
    }
    
    public int gedSpeed(){
        return speed;
    }
    
    public void setSpeed(int speed){
        this.speed = speed;
    }
    
    public double getRegularPrice(){
        return regularPrice;
    }
    
    public void setRegularPrice(double regularPrice){
        this.regularPrice = regularPrice;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }

}
