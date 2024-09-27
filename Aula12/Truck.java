/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage;

/**
 *
 * @author kees
 */
public class Truck extends Car{
    
    private int weight;
    
    @Override
    public double getSalePrice(){
        if (this.weight > 2000){
            return (getSalePrice() - (getSalePrice() * 0.10));
        }else{
            return (getSalePrice() - (getSalePrice() * 0.20));
        }         
    }
    
    public int getWeight(){
        return weight;
    }
    
    public void setWeight(int weight){
        this.weight = weight;
    }

}
