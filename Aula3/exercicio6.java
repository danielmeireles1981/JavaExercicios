/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author root
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class exercicio6 {
    public static void main (String [] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader (System.in));
            String var1="";
            System.out.print("Digite var1:");
            try{
                var1=dataIn.readLine();
            }catch( IOException e){
                System.out.print("Erro");
            String var2="";
            System.out.print("Digite var2:");
            try{
                var1=dataIn.readLine();
            }catch( IOException x){
                System.out.print("Erro");
            String aux;
            aux=(var1==var2)?"TRUE":"FALSE";
            System.out.println("Valor: +aux");
            }
    }
    }
}
