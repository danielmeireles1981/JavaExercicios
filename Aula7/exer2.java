/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage;

/**
 *
 * @author kees
 */
import javax.swing.JOptionPane;
public class exer2 {
    public static void main (String [] args){
        String alf="abcdefghijklmnopqrstuvxywz";
        String crt = JOptionPane.showInputDialog("Digite o indice:");
        int posicao = Integer.parseInt(crt);
        char result = alf.charAt(posicao-1);
        JOptionPane.showMessageDialog(null,  result);
        JOptionPane.showMessageDialog(null, "anterior:" +alf.charAt(posicao++));
        JOptionPane.showMessageDialog(null, "posterior:" +alf.charAt(posicao+1));
        if ((posicao == 0) || (posicao == 5) || (posicao == 8) || (posicao == 14) || (posicao == 20))
        {
            JOptionPane.showMessageDialog(null, "Vogal");
        }
            else {
                JOptionPane.showMessageDialog(null, "Consoante");
            }
            
        }
               
        
    }

