/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage;

/**
 *
 * @author kees
 */
public class MyOwnAutoShop {
    public static void main(String args[]){
        Sedan Sedan1 = new Sedan();
        Ford Ford1 = new Ford();
        Ford Ford2 = new Ford();
        Car Carro1 = new Car();
        
        Sedan1.setColor("azul");
        Sedan1.setLength(15);
        Sedan1.setSpeed(300);
        Sedan1.setRegularPrice(10.00);
        System.out.println("Valor do Sedan: " +Sedan1.getSalePrice());
        
        Ford1.setColor("vermelho");
        Ford1.setManufacturerDiscount(9);
        Ford1.setRegularPrice(10.00);
        Ford1.setSpeed(200);
        Ford1.setYear(2002);
        System.out.println("Valor do Ford1: " +Ford1.getSalePrice());
        
        Ford2.setColor("branco");
        Ford2.setManufacturerDiscount(10);
        Ford2.setRegularPrice(10.00);
        Ford2.setSpeed(200);
        Ford2.setYear(2005);
        System.out.println("Valor do Ford2: " +Ford2.getSalePrice());
        
        Carro1.setColor("amarelo");
        Carro1.setRegularPrice(50000.00);
        Carro1.setSpeed(250);
        System.out.println("Valor do Carro1: " +Carro1.getSalePrice());
    }

}
