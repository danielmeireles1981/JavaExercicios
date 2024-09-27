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
    public static void main (String []args){
        String carta="";
        carta=JOptionPane.showInputDialog("Digite o codigo da carta:");
        char letra1=carta.charAt(0);
        char letra2=carta.charAt(1);
        String resultado = "Sua carta é";
        if (letra1=='A')
           resultado = resultado + "As";
        else if (letra1=='2')
            resultado = resultado + "Dois";
        else if (letra1=='3')
            resultado = resultado + "Tres";
        else if (letra1=='4')
            resultado = resultado + "Quatro";
        else if (letra1=='5')
            resultado = resultado + "Cinco";
        else if (letra1=='6')
            resultado = resultado + "Seis";
        else if (letra1=='7')
            resultado = resultado + "Sete";
        else if (letra1=='8')
            resultado = resultado + "Oito";
        else if (letra1=='9') 
            resultado = resultado + "Nove";
        else resultado = "Erro";
        if (letra2=='C')
            resultado = resultado + "Copas";
        else if (letra2=='O') 
            resultado = resultado + "Ouros";
        else if (letra1=='E') 
            resultado = resultado + "Espadas";
        else if (letra1=='P') 
            resultado = resultado + "Paus";
        else resultado = "Erro";
        JOptionPane.showMessageDialog(null, resultado);
        
    }
}
