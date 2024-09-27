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
public class exer1 {
    public static void main(String [] args){
        String frase1 = JOptionPane.showInputDialog("Digite frase1:");
        int cont1 = frase1.length();
        String frase2 = JOptionPane.showInputDialog("Digite frase2:");
        int cont2 = frase2.length();
        if (cont1 > cont2)
        {
            JOptionPane.showMessageDialog(null, "A Primeira frase é maior que a Segunda!");
        } 
        else
            {
            JOptionPane.showMessageDialog(null, "A Segunda frase é maior que a Primeira");
            }
    } 
}
         

