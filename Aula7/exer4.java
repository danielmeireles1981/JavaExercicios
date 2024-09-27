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
public class exer4 {
    public static void main (String [] args){
        String frase = JOptionPane.showInputDialog("Digite uma frase:");
        String output = new String();
        for (int count=frase.length() - 1; count >=0; count --){
            output += frase.charAt(count) + "";
        }
        JOptionPane.showMessageDialog(null, output);
    }

}
