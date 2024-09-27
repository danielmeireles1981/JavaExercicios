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
      byte [] bytearray = new byte[6];
      for (int i=0; i<6; i++)
      {
      
      String var=JOptionPane.showInputDialog("Digite:");
      char var2 = var.charAt(0);
      bytearray[i]=(byte)var2;
          
      }
      String str = new String(bytearray);
      JOptionPane.showMessageDialog(null, str);
        
          
     }

}
