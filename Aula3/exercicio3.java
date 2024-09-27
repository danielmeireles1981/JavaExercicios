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
public class exercicio3 {
    public static void main(String[] args){
            BufferedReader dataIn = new BufferedReader(new InputStreamReader (System.in));
            String numero="";
            System.out.print("Digite um numero: ");
            try{
                numero=dataIn.readLine();
            }catch( IOException e){
                System.out.print("Erro");
            }
            String aux=(Integer.parseInt(numero)%2==0)?"PAR":"IMPAR";
            System.out.println(aux);
                   
    }
}
