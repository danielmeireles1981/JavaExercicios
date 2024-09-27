/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author java
 */
import javax.swing.JOptionPane;
public class while2 {
    public static void main(String []args){
        String valor1="";
        valor1=JOptionPane.showInputDialog("Digite o valor:");
        int aux, x;
        aux=Integer.parseInt(valor1);
        for (x=0;aux<=1000;x++){
            if (x==aux)
                break;
        System.out.println(x);
        }
        
        
    }

}
