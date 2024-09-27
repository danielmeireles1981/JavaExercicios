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
public class ex3 {
    public static void main(String [] args){
        StringBuffer frase = new StringBuffer(JOptionPane.showInputDialog("Digite uma frase:"));
        JOptionPane.showMessageDialog(null, frase);
    }

}
