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
public class exer8 {
    public static void main(String [] args){
        String frase = JOptionPane.showInputDialog("Digite uma frase");
        String replace = frase.replace("a","#");
        frase = replace;
        replace = frase.replace("e","#");
        frase = replace;
        replace = frase.replace("i","#");
        frase = replace;
        replace = frase.replace("o","#");
        frase = replace;
        replace = frase.replace("u","#");
        frase = replace;
        replace = frase.replace("A","#");
        frase = replace;
        replace = frase.replace("E","#");
        frase = replace;
        replace = frase.replace("I","#");
        frase = replace;
        replace = frase.replace("O","#");
        frase = replace;
        replace = frase.replace("U","#");
        JOptionPane.showMessageDialog(null, replace);
        
    }

}
