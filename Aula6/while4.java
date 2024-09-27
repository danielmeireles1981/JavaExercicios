/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author java
 */
import javax.swing.JOptionPane;
public class while4 {
    public static void main(String []args){
        int x;
        do{
        String valor1="";
        valor1=JOptionPane.showInputDialog("Digite o valor:");
        x=Integer.parseInt(valor1);
                       
        } while ((x>=0) && (x<=50));
               
    }

}
