/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage;

/**
 *
 * @author kees
 */
public class Sedan extends Car{
    
    private int length;
    
    @Override
    public double getSalePrice(){
        if (this.length > 20){
            return (super.getSalePrice() - (super.getSalePrice() * 0.05));
        }else{
            return (super.getSalePrice() - (super.getSalePrice() * 0.10));
        }
    }
    
    public double getLength(){
        return length;
    }
    
    public void setLength(int length){
        this.length = length;
    }

}
