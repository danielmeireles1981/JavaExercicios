/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author java
 */
import javax.swing.JOptionPane;
public class exercicio2 {
    public static void main (String []args){
        String resultado = "Os valores em ordem crescente sao: \n";
        String aux1;
        aux1=JOptionPane.showInputDialog("Digite o valor1:");
        String aux2;
        aux2=JOptionPane.showInputDialog("Digite o valor2:");
        String aux3;
        aux3=JOptionPane.showInputDialog("Digite o valor3:");
        float num1=Float.parseFloat(aux1);
        float num2=Float.parseFloat(aux2);
        float num3=Float.parseFloat(aux3);
        //321
        if ((num1 > num2) && (num1 > num3) && (num2 > num3))
            resultado = resultado +num3 +num2 +num1;
        //123
        else if ((num1 < num2) && (num1 < num3) && (num2 < num3))
            resultado = resultado +num1 +num2 +num3;
        //321
        else if ((num2 > num1) && (num2 < num3) && (num1 > num3))
            resultado = resultado +num3 +num2 +num1;
        //213
        else if ((num2 < num1) && (num2 < num3) && (num1 < num3))
            resultado = resultado +num2 +num1 +num3;     
        //312
        else if ((num3 < num1) && (num3 > num2) && (num2 < num1))
            resultado = resultado +num2 +num3 +num1;
        //132
        else if ((num3 > num1) && (num3 < num2) && (num2 > num1))
            resultado = resultado +num1 +num3 +num2;
        //231
        else if ((num1 > num3) && (num1 < num2) && (num2 > num3))
            resultado = resultado +num3 + num1 +num2;       
            
       JOptionPane.showMessageDialog(null, resultado);        
            
    }
    

}
