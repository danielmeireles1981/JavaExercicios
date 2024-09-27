/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage;

/**
 *
 * @author kees
 */
public class ex3 {
    public static void main(String [] args){
        int array[] = new int[100];
        int soma = 0;
        for (int count=0; count<array.length; count++){
            array[count]=count+1;
            soma += array[count];
            System.out.println("Posicao " +count +":"  +array[count]);
            System.out.println(soma);
        }
        
    }

}
