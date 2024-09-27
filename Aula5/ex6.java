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
public class ex6 {
    public static void main (String [] args){
      byte [] bytearray = new byte[6];
      for (int i=0; i<6; i++)
      {
      
      String var=JOptionPane.showInputDialog("Digite:");
      char var2 = var.charAt(0);
      bytearray[i]=(byte)var2;
          
      }
      try{
          String strChar = new String(bytearray,"UTF-8");
          System.out.println(strChar);
          
          strChar = new String(bytearray,"UTF-16");
          System.out.println(strChar);
          
          strChar = new String(bytearray,"ASCII");
          System.out.println(strChar);
          
      }catch (UnsupportedEncodingException exp) {
              System.out.println("erro");
      }
          
    }
}
         
