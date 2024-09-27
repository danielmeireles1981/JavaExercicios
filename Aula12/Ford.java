/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage;

/**
 *
 * @author kees
 */
public class Ford extends Car{
    
    private int year;
    
    private int manufacturerDiscount;
    
    @Override
    public double getSalePrice(){
        return super.getSalePrice() - super.getSalePrice() * (getManufacturerDiscount()/100.00);
    }
    
    public int getYear(){
        return year;
    }
    
    public void setYear(int year){
        this.year = year;
    }
    
    public int getManufacturerDiscount(){
        return manufacturerDiscount;
    }
    
    public void setManufacturerDiscount(int manufacturerDiscount){
        this.manufacturerDiscount = manufacturerDiscount;
    }

}
