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
public class ex7 {
    public static void main(String [] args){
        byte [] array = { (byte)'J', (byte)'a', (byte)'m', (byte)'e', (byte)'s', (byte)'G',(byte)'o',(byte)'s',(byte)'l',(byte)'i',(byte)'n',(byte)'g'};
        String str = new String(array,0,5);
        JOptionPane.showMessageDialog(null, str);
                             
    }

}
