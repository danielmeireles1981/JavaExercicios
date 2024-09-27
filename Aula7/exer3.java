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
public class exer3 {
    public static void main (String [] args){
        String frase = "Minha tia vai a feira aos domingos";
        String output = new String();
        char [] copia = new char[18];
        frase.getChars(6, 9, copia, 0);
        frase.getChars(16, 21, copia, 4);
        frase.getChars(26, 34, copia, 10);
        System.out.println(copia);
        for (int count=0; count < copia.length; count++ ){
            output += copia[count];
        }
            
        JOptionPane.showMessageDialog(null, output);
                
    }
}
