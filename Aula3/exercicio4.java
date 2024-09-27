/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author java
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.lang.Math;
public class exercicio4 {
    public static void main(String[] args){
            BufferedReader dataIn = new BufferedReader(new InputStreamReader (System.in));
            String x="";
            System.out.print("Digite o primeiro numero: ");
            try{
                x=dataIn.readLine();
            }catch(IOException e){
                System.out.print("Erro");
            String y="";
            y=JOptionPane.showInputDialog("Digite o segundo numero: ");
            int num1=Double.parseInt(x);
            double num2=(double)y;
            double exp1;
            exp1=(num1+num2)*1000-(num2*num2*num2)/Math.sqrt(num1);
            String exp2;
            exp2=(Math.exp(num1))+Math.exp(num2)*(Math.pow(num1,num2)+Math.pow(num2,num1))-(Math.log(num1)/Math.log(num2))/(Math.max(num1,num2)+Math.min(num1,num2)); b))
}
    }
}