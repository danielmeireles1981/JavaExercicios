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
public class ex6 {
    public static void main(String []args){
        double array[] = new double[6];
        double max=0.0, min=0.0;
        int maxpos=0, minpos=0;
        for (int count=0; count < array.length; count++){
            array[count] = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor:"));    
            System.out.println("Array" +count +":"  +array[count]);
            if (array[count]==0){
                minpos++;
            } else if (array[count]>=max)
                {
                max = array[count];
                maxpos++;
                if (array[count]<=min){
                    min = array[count];
                    minpos++;
                    }
                }
    }
    JOptionPane.showMessageDialog(null, "Maior numero "+max +"\nMenor numero: " +min +"\nPosicao menor: " +minpos + "\nPosicao maior: " +maxpos );
    }
}
