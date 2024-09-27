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
    public static void main(String []args){
        String nome = new String();
        nome = JOptionPane.showInputDialog("Digite nome:");
        JOptionPane.showMessageDialog(null, "Ola Caro(a) " +nome +",seja bem-vindo!!");
        
    }

}
