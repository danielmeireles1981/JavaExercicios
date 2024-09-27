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
public class ex5 {
    public static void main(String [] args){
      char [] chararray = new char[6];
      for (int i=0; i<6; i++)
      {
      
      String var=JOptionPane.showInputDialog("Digite:");
      chararray[i]= var.charAt(0);
                
      }
      String str = new String(chararray);
      JOptionPane.showMessageDialog(null, str);
        
          
     }

}