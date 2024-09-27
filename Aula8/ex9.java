/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage;

/**
 *
 * @author kees
 */
public class ex9 {
    public static void main(String [] args){
        int array []= {100,287,67,71,59,43,25,16,96};
        for (int count=0; count <array.length; count++){
            System.out.println("Normal:" +array[count]);
        }
        for (int count=0; count <array.length; count++){
            for (int count2=0; count2<array.length; count2++){
                if (array[count2]<array[count]){
                    int x = array[count];
                    array[count] = array[count2];
                    array[count2] = x;
                }
            }
        }
        for (int count=0; count <array.length; count++){
            System.out.println("Decrescente:" +array[count]);
    }
    }
}