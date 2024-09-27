/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage;

/**
 *
 * @author kees
 */
public class ex7 {
    public static void main(String [] args){
        int array[] = new int[10];
        int calculo=0;
        for (int count=0, valor=2101; count < array.length; count++){
            array[count]=valor++;
            System.out.println("Mostrando o array:" +array[count]);
            calculo += array[count];
        }
        System.out.println(calculo/array[9]);
        
    }
}
