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
public class ex4 {
    public static void main(String [] args){
        double [] array;
        array = new double[10];
        double media=0, soma=0;
        for (int count=0; count < array.length; count++){
            array[count] = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor:"));    
            soma += array[count];
        }
        media = soma/array.length;
        JOptionPane.showMessageDialog(null, media);
        
        
    }

}
