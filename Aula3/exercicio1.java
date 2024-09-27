/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author java
 */
import javax.swing.JOptionPane;
public class exercicio1 {
    public static void main (String [] args){
        String valor1="";
        valor1=JOptionPane.showInputDialog("Digite o primeiro valor:");
        String valor2="";
        valor2=JOptionPane.showInputDialog("Digite o segundo valor:");
        int soma=(Integer.parseInt(valor1)+Integer.parseInt(valor2));
        JOptionPane.showMessageDialog(null, "Soma:" +soma);
        int diferenca=(Integer.parseInt(valor1)-Integer.parseInt(valor2));
        JOptionPane.showMessageDialog(null, "Diferenca:" +diferenca);
        int produto=(Integer.parseInt(valor1)*Integer.parseInt(valor2));
        JOptionPane.showMessageDialog(null, "Produto:" +produto);
        int media=((Integer.parseInt(valor1)+Integer.parseInt(valor2))/2);
        JOptionPane.showMessageDialog(null, "Media:" +media);
        int max=(Integer.parseInt(valor1)>Integer.parseInt(valor2))?Integer.parseInt(valor1):Integer.parseInt(valor2);
        JOptionPane.showMessageDialog(null, "Numero Max:" +max);
        int min=(Integer.parseInt(valor1)<Integer.parseInt(valor2))?Integer.parseInt(valor1):Integer.parseInt(valor2);
        JOptionPane.showMessageDialog(null, "Numero min:"+min);
        }
}
