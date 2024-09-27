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
public class exercicio2 {
    public static void main(String[] args){
            BufferedReader dataIn = new BufferedReader(new InputStreamReader (System.in));
            String name="";
            System.out.print("Digite seu nome:");
            try{
                name=dataIn.readLine();
            }catch( IOException e){
                System.out.print("Erro");
            }
            String msg="Seja Bem-vindo(a): " +name +" !";
            JOptionPane.showMessageDialog(null, msg);
    }
}