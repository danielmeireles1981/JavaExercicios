/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage;

/**
 *
 * @author kees
 */
import javax.swing.*;
public class ex1 {
    public static void main(String [] args){
        int array [] = new int[4];
        System.out.println("Instanciando o array, mostrando valores:");
        for (int i=0; i < array.length; i++){
            System.out.println(array[i]);
        }
    array[0]=10;
    array[1]=20;
    array[2]=30;
    array[3]=40;
    System.out.println("Valores definidos no array:");
    for (int i=0; i < array.length; i++){
            System.out.println(array[i]);
        }
         
    }

}
